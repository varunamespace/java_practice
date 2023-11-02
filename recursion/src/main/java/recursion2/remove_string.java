package recursion2;

public class remove_string {
    public static void main(String[] args) {
        System.out.println("works");
        String ans = skipApple("babappleapp");
        System.out.println(skipAppIfNotApple("bdapplegh"));
        System.out.println(ans);
    }
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else {
            char ch = s.charAt(0);
            return ch+skipApple(s.substring(1));
        }
    }
    static String skipAppIfNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppIfNotApple(s.substring(3));
        }
        else {
            char ch = s.charAt(0);
            return ch+skipAppIfNotApple(s.substring(1));
        }
    }


}
