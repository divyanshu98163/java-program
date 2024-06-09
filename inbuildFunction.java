import java.util.Arrays;
import java.util.Collections;

public class inbuildFunction {
   
    public static void main(String arg[]){
        Integer arr[] = {2,7,6,5,4,1};
        Arrays.sort(arr,0,4);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        Arrays.sort(arr,0,4,Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
    }
}
