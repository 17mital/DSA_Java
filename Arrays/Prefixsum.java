public class Prefixsum {
    public static void printsubarray(int number[]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0; i<number.length;i++){
            int start = i;
            for(int j=i ;j<number.length;j++){
                int end=j;
                sum=0;
                sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(sum<min_sum){
                    min_sum=sum;
                }
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
            System.out.println();
        }
        System.out.println(" Minimum Sum of subarray :"+min_sum);
        System.out.println(" Maximum Sum of subarray :"+max_sum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarray(number);


        
    }
}
