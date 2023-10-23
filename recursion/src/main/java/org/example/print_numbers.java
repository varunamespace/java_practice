package org.example;

public class print_numbers {
    public static void main(String[] args) {
        printrec(1);
    }
    static int printrec(int n){
        if(n==5){
            System.out.println(5);
            return 5;
        }
        System.out.println(n);
        return printrec(n+1);
    }
}
