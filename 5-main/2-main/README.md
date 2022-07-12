//


package ru.ac.uniyar.mf.potsel.sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        //boolean flag = false;
        System.out.println("Введите первое число:");
        
        Scanner in = new Scanner(System.in);
        
        String str1 = in.next();
        
        int ind = str1.indexOf('/');
        
        if (ind == -1) {
            int x = Integer.parseInt(str1);
            //String s = in.next();
            System.out.println("Введите операцию:");
            String num1 = in.next();
            System.out.println("Введите второе число:");
            String _y = in.next();
            int y = Integer.parseInt(_y);
            if (y != 0) {
                switch (num1) {
                    case "+":
                        System.out.println(x + y);
                        break;
                    case "-":
                        System.out.println(x - y);
                        break;
                    case "*":
                        System.out.println(x * y);
                        break;
                    case "/":
                        System.out.println(x +"/"+ y);
                        break;
                }
            } else if (y == 0 && x != 0) {
                System.out.println("На ноль делить нельзя!");
            } else if (x == 0 && y == 0) {
                System.out.println("Неопределённость типа 0/0");
            }

        } else {
            int x2 = 0, y2 = 0;
            String[] parth = str1.split("/");
            int x1 = Integer.parseInt(parth[0]);
            int y1 = Integer.parseInt(parth[1]);
            System.out.println("Введите операцию:");
            String s1 = in.next();
            System.out.println("Введите втророе число:");
            String str2 = in.next();
            int ind1 = str2.indexOf("/");
            if (ind1 != -1) {
                String[] parth1 = str2.split("/");
                 x2 = Integer.parseInt(parth1[0]);
                 y2 = Integer.parseInt(parth1[1]);
            } else {
                x2 = Integer.parseInt(str2); y2 = 1;
            }
            switch (s1) {
                case "+":
                    if (y1 != 0 && y2 != 0) {
                        x1 = (x1 * y2) + (y1 * x2);
                        y1 *= y2;
                        System.out.println(x1 +"/" + y1);
                    } else System.out.println("На ноль делить нельзя");
                    break;
                case "-":
                    if (y2 != 0 && y1 != 0) {
                        x1 = (x1 * y2) - (y1 * x2);
                        y1 *= y2;
                        System.out.println(x1 +"/" + y1);
                    }else System.out.println("На ноль делить нельзя");
                    break;
                case "*":
                    if (y1 != 0 && y2 != 0) {
                        x1 *= x2;
                        y1 *= y2;
                        System.out.println(x1 +"/" + y1);
                    }else System.out.println("На ноль делить нельзя");
                    break;
                case "/":
                    if (y1 != 0 && y2 != 0) {
                        x1 *= y2;
                        y1 *= x2;
                        System.out.println(x1 +"/" + y1);
                    }else System.out.println("На ноль делить нельзя");
                    break;
            }
        }
   }
}
