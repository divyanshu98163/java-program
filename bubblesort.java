public class bubblesort {
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printarray(int arr[]){
        
        for(int i= 0; i<arr.length; i++){
            System.err.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,2,3};
        BubbleSort(arr);
        printarray(arr);
        System.out.println(arr);
    }
}

