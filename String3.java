

public class String3 {
    public static  void  main(String arg[]){
        String s1 = "Divyanshu";
        String s2 = "Divyanshu";
        String s3 = new String("Divyanshu");

        if(s1==s2){
            System.err.println("String is equal");
        }
        else{
            System.err.println("String is not equal ");
        }

        // s1 s3 is not equal in this case 
        if(s1==s3){
            System.err.println("String is equal");
        }
        else{
            System.err.println("String is not equal ");
        }
        // s1 s3 is  equal in this case 
        if(s1.equals(s3)){
            System.err.println("String is equal");
        }
        else{
            System.err.println("String is not equal ");
        }
    }
}
