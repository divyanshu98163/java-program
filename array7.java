public class array7 {
    public static void Subarray(int number[]){
        for(int i = 0; i<number.length; i++){
            for(int j= 0; j<number.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int number[] = {2,4,6,8,10};
        Subarray(number);
    }
}
