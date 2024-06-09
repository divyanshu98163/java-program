public class selectionSort {
    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minVal = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[minVal]> arr[j]){
                    minVal=j;
                }
            }int temp = arr[minVal];
            arr[minVal]=arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
    public static void main(String arg[]){
        int arr[] = {6,7,8,4,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}
