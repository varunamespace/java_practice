package subsequence;

import java.util.ArrayList;

//No of dice roll with Target Sum
public class diceRoll {
    public static void main(String[] args) {
        diceSum("",2);
        System.out.println(diceList("",3));

    }
    static void diceSum(String p , Integer target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<6&&i<=target;i++){
            diceSum(p+i,target-i);
        }
    }
    static ArrayList<String> diceList(String p, Integer  up){
        if(up==0){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=1 ; i<6 && i<=up ;i++){
            ans.addAll(diceList(p+i,up-i));
        }
        return ans;
    }
}
