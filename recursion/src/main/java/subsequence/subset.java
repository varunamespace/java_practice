package subsequence;

import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        String s= "ab";
        subsetRet("","ab");

    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subsetRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p+ch,up.substring(1));
        ArrayList<String> right = subsetRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
