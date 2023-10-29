package recursion2;

public class removea {
    public static void main(String[] args) {
        String s = "baccad";
        String ans = "";
        //System.out.println(s.substring(1));
        remove(s,ans);
        System.out.println(ans);
    }
    static void remove(String s , String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char first = s.charAt(0);
        if(first == 'a'){
            remove(s.substring(1),ans);
        }
        else{
            remove(s.substring(1),ans+first);
        }
    }
}
