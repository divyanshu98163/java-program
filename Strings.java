import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String Firstname,lastName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Firstname : ");
        Firstname = sc.nextLine();
        System.out.println("Enter the Lastname : ");
        lastName = sc.nextLine();
        String FullName = Firstname+" "+lastName;
        System.out.println("Name :-"+FullName);
        System.out.println("length of string "+FullName.length());
    }
}
