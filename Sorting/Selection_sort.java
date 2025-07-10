package Sorting;

public class Selection_sort {
    public static void sort(int nums[]){
        boolean alreadySorted = true;
        for(int i=0;i<=nums.length-2;i++){
            int minpose=i;
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[minpose]>nums[j]){
                    minpose=j;
                }
            }
            if (minpose != i) {
                int temp = nums[minpose];
                nums[minpose] = nums[i];
                nums[i] = temp;
                alreadySorted = false; // A swap happened
            }
            if(i==0 && alreadySorted){
            System.out.println("Array is already sorted");
            break;
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
        int nums[]={1,2,3,4,5};
        sort(nums);
        printarr(nums);
    }
    
}
