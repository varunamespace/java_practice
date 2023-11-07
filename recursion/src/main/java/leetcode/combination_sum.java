package leetcode;

import java.util.ArrayList;

public class combination_sum {
    public static void main(String[] args) {
        ArrayList<Integer> candidates = new ArrayList<Integer>();
        candidates.add(2);
        candidates.add(3);
        candidates.add(6);
        candidates.add(7);
        System.out.println(candidates.get(0));
        System.out.println(comSum(0,7,0,candidates));
        //comSum(0,7,0,candidates);
    }
    static ArrayList<Integer> comSum(Integer p , Integer up, Integer index, ArrayList<Integer> candidates){
        if(up==0){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(up);
            return temp;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=index;i<candidates.size();i++) {
            if(up- candidates.get(i)>=0){
                ans.addAll(comSum(p+ candidates.get(i),up- candidates.get(i),i,candidates ));
            }
        }
        return ans;
    }
}
