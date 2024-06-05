import java.util.*;
public class array5 {
    public static void RevesreArray(int numbers[]){
        int first = 0;
        int  last=numbers.length-1;
        while (first<last) {
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
            
        }
    }
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10};
        RevesreArray(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
