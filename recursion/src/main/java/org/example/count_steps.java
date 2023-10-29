package org.example;

public class count_steps {
    public static void main(String[] args) {
        int c = 0;
        int n = 14;
        System.out.println(count(n,c));

    }
    static int count(int n, int ans){
        if(n==0){
            return ans;
        }
        if(n%2==0){
            ans = ans + 1;
            return count(n/2,ans);
        }
        else {
            ans = ans + 1;
            return count(n-1,ans);
        }

    }

}
