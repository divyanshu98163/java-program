
public class Ithbit {

    public static int setIthBit(int n, int i) {
        int bitMast = 1 << i;
        return n | bitMast;
    }

    public static int clearIthBit(int n, int i) {
        int bitMast = 1 << i;
        return n & bitMast;
    }

    public static int upadeIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit<< i;
        return n|bitMask;
    }

    public static int clearlastBit(int n,int i){
        int bitMask = (~0)<<i;
        return  n & bitMask;
    }
    public static int clearBitsinRange(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOftwo(int n){
        return (n&(n-1))==0;
    }

    public static  int countSetBit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1) !=0){
                ans = ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));

}
}
