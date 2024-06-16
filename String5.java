

public class String5 {
    public static String Substring(String str,int si,int en) {
        String substr = "";
        for(int i = si; i<en; i++){
            substr += str.charAt(i);
        }
         return substr;
    }
    public static void main(String arg[]){
        String str = "hello World";
        //java pre define substring function
        System.err.println(str.substring(0,5));
        System.err.println(Substring(str, 6, 11));

    }
}
