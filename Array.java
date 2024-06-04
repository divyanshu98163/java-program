import java.util.*;
public class Array {
    public static void main(String arg[]){
           int marks[] =new int[50];
          System.out.println(marks.length);
        Scanner sc= new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy "+marks[0]);
        System.out.println("chem "+marks[1]);
        System.out.println("math "+marks[2]);
         
        int   parcentage  = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("avreage marks"+parcentage);
    }
}
