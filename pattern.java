import java.util.*;
public class pattern {
    public static void  dimond_shape(int n){
        // upper shape 
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower line
        for(int i =n; i>=1; i--){
            //space
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dimond_shape(n);

    }
}
