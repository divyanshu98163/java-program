public class array8 {
    public static void maxSubarraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum=0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                     maxSum =currSum;

                }
            }
        }
        System.out.println("max sum "+maxSum);
    }

    public static void main(String arg[]) {
        int number[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(number);
    }
}
