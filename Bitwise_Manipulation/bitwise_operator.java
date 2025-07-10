package Bitwise_Manipulation;
public class bitwise_operator {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask) ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static int getIthBit(int n , int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitmask= 1<<i;
        return n|bitmask ;
    }
    public static int clearIthBit(int n , int i){
        int bitmask=~(1<<i);
        return n & bitmask;

    }
    public static int updateIthBit(int n , int i , int newbit ){
        //approch 1
        // if(newbit==0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        //approch 2
        n=clearIthBit(n, i);
        int Bitmask=newbit<<i;
        return n| Bitmask;
    }
    public static int  clearLastBit(int n , int i){
        int Bitmask=~0<<i;
        return n  & Bitmask;
    }
    public static int clearRange(int n , int i , int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static boolean power2(int n ){
        return (n & (n-1))==0;
    }
    public static int countsetbit(int n ){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastexpo(int a , int n){
        int ans=1;
        while(n>0){
            if((n&1)==1){
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println((5 & 6));
        // System.out.println((5 | 6));
        // System.out.println((5 ^ 6));
        // System.out.println((~ 5));   //2s compliment positive of ans  
        // System.out.println((1<<2));
        // System.out.println((6>>1));   
        // oddoreven(4);
        //System.out.println(getIthBit(10, 3));
        //System.out.println(setIthBit(3, 2));
        //System.out.println(clearIthBit(3, 1));
        //System.out.println(updateIthBit(3, 2, 1));
        //System.out.println(clearLastBit(15, 2));
        System.out.println(clearRange(10, 2,7));
        //System.out.println(power2(4));
        //System.out.println(countsetbit(3));
        System.out.println(fastexpo(3, 5));
    }
    
}
 