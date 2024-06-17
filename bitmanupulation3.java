public class bitmanupulation3 {
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask) ==0){
            return  0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMast= 1<<i;
        return n|bitMast;
    }
    public static int clearIthBit(int n,int i){
        int bitMast= 1<<i;
        return n&bitMast;
    }
    public static void main(String[] args) {
        System.err.println("get ith bit "+ getIthBit(10, 2));
        System.err.println("Set ith bit "+setIthBit(10, 2));
        System.err.println("claer ith bit "+clearIthBit(10, 1));
        
    }
}
