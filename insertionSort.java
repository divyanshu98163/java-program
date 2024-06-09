public class insertionSort {
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int current = arr[i];
            int prev =i-1;
            while (prev>=0 && arr[prev]>current) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }arr[prev+1]=current;
        }
    }
    public static void printArry(int arr[]){
        InsertionSort(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[] ={ 8,4,5,3,9,6,7,2};
       
        printArry(arr);
        
    }
}
