package org.example;

public class regex {
    public static void main(String[] args) {
        String s = "Samantha";
        int check = 1;
        System.out.println(s.length());
        if((s.length()<8)||(s.length()>30)) {
            check = 0;
        }
        System.out.println(check);
    }
}
