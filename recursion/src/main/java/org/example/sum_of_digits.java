package org.example;

public class sum_of_digits {
    public static void main(String[] args) {
        int ans = sod(1234);
        System.out.println(ans);
    }
    static int sod(int n){
        if(n/10==0){
            return n;
        }
        return n%10+(sod(n/10));
    }
}
