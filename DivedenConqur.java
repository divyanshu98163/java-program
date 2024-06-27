public class DivedenConqur {

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.err.println();
    }


    public static void QuackSort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }

        // last element
        int pIdx =partition(arr,si,ei);
        QuackSort(arr, si, pIdx-1);
        QuackSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivit =arr[ei];
        int i =si-1;

        for(int j= si; j<ei;  j++){
            if(arr[j] <= pivit){
                i++;
                int temp =arr[j];
                arr[j]=arr[i];
                arr[i] =temp;
            }
        }
        i++;

        int temp = pivit;
        arr[ei] =arr[i];
        arr[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        int arr[] ={6,3,9,8,2,5};
        QuackSort(arr, 0,arr.length-1);
        printArr(arr);
        
    }
}
