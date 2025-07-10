package Sorting;
public class Counting_sort {
    public static void sort(int nums[]){
        int Largest =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            Largest=Math.max(Largest, nums[i]);
        }
        int count[]=new int[Largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={1,4,1,3,2,4,3,7};
        sort(nums);
        printarr(nums);
    }
    
}
