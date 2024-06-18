

public class Bitmanipulation {
    public static int clearIBits(int n, int i)
    {
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int clearlastIbits(int n,int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static int clearrangeofbits(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean ispoweroftwo(int n){
        return (n & (n-1))==0;
    }
    public static int fastexpo(int a, int n){

        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        //System.out.println(clearIBits(15,2));
        //System.out.println(clearlastIbits(15,2));
      //  System.out.println(clearrangeofbits(15,2,6));
        //System.out.println(ispoweroftwo(13));
        System.out.println(fastexpo(5,3));
       

    }
}
