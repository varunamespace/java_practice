package org.example;

public class prime {
    public static void main(String[] args) {
        int n = 40;
        for(int i=0;i<n;i++){
            System.out.println(i + "is prime: " + isPrime(i));
        }

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        //check till the sqrt of the number, so squaring both sides
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c = c + 1;
        }
        return true;
    }
}
