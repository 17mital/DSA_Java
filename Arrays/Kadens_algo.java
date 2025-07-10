public class Kadens_algo {
    public static void kadenalgo(int number[]){
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Max subarray sum is"+ ms);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        kadenalgo(number);

    }
    
}
