package org.example;

public class count_zeros {
    public static void main(String[] args) {
        int n = 3020100;
        System.out.println(cz(n,0));
    }
    static int cz(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count = count + 1;
        }
        return cz(n/10,count);
    }
}
