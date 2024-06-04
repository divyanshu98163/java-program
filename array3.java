public class array3 {
    public static int largest(int number[]){
        int smallast = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallast>number[i]){
                smallast=number[i];
            }
        }
        System.out.println("smallast value in array = "+smallast);
        return largest;
    }

    public static void main(String[] arg){
        int number[]= {2,1,7,4,5,3};
        System.out.println("largest number of array "+largest(number));

    }
}
