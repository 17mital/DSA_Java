package Sorting;
public class Bubble_sort {
    public static void sort(int nums[]){
         int swap=0;
        for(int turn=0;turn<nums.length-1;turn++){
           
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap++;
                }  
            } 
            if(swap==0){
                System.out.println("Array is allredy sorted");
                break;
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        sort(nums);
        printArr(nums);

    }
}
