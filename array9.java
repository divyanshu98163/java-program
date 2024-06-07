public class array9 {
    public static void kadanes(int number[]){
        int maxSum = Integer.MIN_VALUE; //maxium sum
        int currSum = 0; //current sum 
        for(int i = 0; i<number.length; i++){
            currSum =currSum+number[i];
            if(currSum<0){
                currSum =0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max sum of subarray "+maxSum);
    }
    public static void main(String arg[]){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }
}
