import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import ru.ac.uniyar.mf.summer.Node;

import java.io.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Struct;

import static org.junit.jupiter.api.Assertions.assertEquals;

//public class NodeTests {
    public class TestNode {
        @Test
        void create_tree(){
            Node node = new Node("name");
            assertEquals("name", node.getName());
        }
        @Test
        void addNode(){
            Node root = new Node("name");
            Node chil = new Node("list");
            Node  roo = new Node("ttt");
            assertEquals("name", root.getName());
            assertEquals("list", chil.getName());
            chil.addl("hhhh");
            assertEquals("hhhh", chil.getName1("hhhh"));
            chil.removeChild("hhhh");
            assertEquals(false, chil.find_node("hhhh"));
        }
   // }
    @Test
    void printstr() throws IOException {
        Node root = new Node("Корень");
        Node child = new Node("Лист");
        Node kid = new Node("Ствол");
        root.add_node(child);
        root.add_node(kid);
        //assertEquals(2, root.getChild("Корень").size());
        //assertEquals("Лист", root.getChild().get(0).getName());
        //assertEquals("Ствол", root.getChild().get(1).getName());
        System.out.println(root.printstr());
    }

    @Test
    void printfile() throws IOException {
        Node root = new Node("Корень");
        Node child = new Node("Лист");
        Node kid = new Node("Ствол");
        root.add_node(child);
        root.add_node(kid);
        assertEquals(2, root.getChildren().size());
        assertEquals("Лист", root.getChildren().get(0).getName());
        assertEquals("Ствол", root.getChildren().get(1).getName());
        String content = root.printstr();
        String path = "file.txt";
        Files.write(Paths.get(path), content.getBytes());
    }
}