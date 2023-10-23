package org.example;

public class binary_sqrt_method {
    public static void main(String[] args) {
        int start = 0;
        int end = 81;
        int target = 81;
        int ans = rec(start,end,target);
        System.out.println(ans);
    }
    static int rec(int start, int end, int target){
        int mid = (start+end)/2;
        if(mid*mid > target){
            return rec(start,mid-1,target);
        }
        if(mid*mid < target){
            return rec(mid+1,end,target);
        }
        if(mid*mid==target){
            return mid;
        }
        return 1;
    }
}
