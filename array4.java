public class array4 {
    public static int BinraySearch(int number[],int key){
        int start= 0;
        int end = number.length-1;
        while(start<=end){
           int mid =(start+end)/2;
           // campare 
           if(number[mid] ==key){
                return mid;
           }
           if(number[mid]>key){//left
                end = mid -1;
           }
           else{  //right
                start=start+1;
           }
        }
           return -1;
    }
    public static void main(String arg[]){
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("Index for a key "+BinraySearch(number, key));
    }
}
