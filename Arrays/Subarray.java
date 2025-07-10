//Brute Force Approach Code of Print subarray from given array and tiatl sum of each sunarray and from them printing min and max subarray sum . total no, of subarray form from the original array.
public class Subarray {
    public static void printsubarray(int number[]){
        int ts=0;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        for(int i=0; i<number.length;i++){
            int start = i;
            for(int j=i ;j<number.length;j++){
                int end=j;
                sum=0;
                for( int k=start ;k<=end;k++){
                    
                    System.out.print(number[k]+" ");
                    sum=sum+number[k];
                }
                ts++;
                System.out.println("Sum of this subarray :"+ sum);
                if(sum<min_sum){
                    min_sum=sum;
                }
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
            System.out.println();
        }
        
        System.out.println(" Total subarray :"+ts);
        System.out.println(" Minimum Sum of subarray :"+min_sum);
        System.out.println(" Maximum Sum of subarray :"+max_sum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarray(number);


        
    }
    
}
