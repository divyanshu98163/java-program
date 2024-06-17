public class bitmanipulation2 {
    public static void OddEven(int n){
        int BitWise = 1;
        if((n &BitWise) ==0){
            System.out.println(" Even number ");
        }
        else{
            System.err.println("odd number ");
        }
    }
    public static void main(String[] args) {
        OddEven(5);
        OddEven(10);
        
    }
}
