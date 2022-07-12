package ru.ac.uniyar.mf.summer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Node {
    private String id;
    private String name;
    private List<Node> child;

    public Node(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.child = new ArrayList<Node>();
    }

    public void create_tree() {
        Scanner in = new Scanner(System.in);
        String _name = in.next();
        String id = UUID.randomUUID().toString();
        child = new ArrayList<Node>();
    }

    public boolean find_node(String id) {
        int ind = child.indexOf(id);
        if (ind != -1) return true;
        else return false;
    }

    public void Srearch_in_Tree(String id) {
        if (find_node(id)) System.out.println(child.indexOf(id));
        else System.out.println("The desired value is missing!");
    }

    public void add_node(Node name) {
        this.child.add(name);
    }

    public void addl(String name) {
        this.child.add(new Node(name));
    }

    public void removeChild(Node name) {
        this.child.remove(name);
    }

    public void removeChild(String name) {
        this.removeChild(this.getChild(name));
    }

    public Node getChild(int id) {
        return this.child.get(id);
    }

    public Node getChild(String childName) {
        for (Node child : this.child) {
            if (child.getName().equals(childName)) {
                return child;
            }
        }
        return null;
    }

    void red(Node name, Node id) {
        Scanner in = new Scanner(System.in);
        String _name = in.next();
        String _id = UUID.randomUUID().toString();
        this.name = _name;
        this.id = _id;
    }

    public void set_child(String id) {
        for (int i = 0; i < child.size(); i++) {
            if (child.get(i).id == id) {
                removeChild(id);
                addl(id);
                break;
            }
        }
    }

    public String getName() {
        this.name = name;
        return this.name;
    }

    public String getName1(String _name) {
        this.name = _name;
        return _name;
    }

    public String printstr() {
        return printstr("", 0);
    }
    private String printstr4(){
        String result = "";
        result += "<li>";
        result += name;
        result += "</li>";
        for (int i = 0; i < child.size(); i++){
            result += "<li>";
            result += child.get(i).printToHtml();
            result += "</li>";
        } result += "</li>"; return result;
    }
    public String printToHtml(){
        String result = "     <ul>";
        result += printstr4();
        result += "</ul>";
        return result;
    }
    private String printstr(String s, int t) {
        for (int i = 0; i < t; i++) {
            s += " ";
        }
        s += "<li>";
        s += name; System.out.
        if (s != "Корень"){
            s += "     ";
        }
        s += "</li>";
        if (child.size() == 0) {

            return s;
        } else {
            for (int i = 0; i < child.size(); i++) {
                s += child.get(i).printstr("", t + 1);
            }
            return s;
        }
    }

    // public String printHTML() {

    //}

}

