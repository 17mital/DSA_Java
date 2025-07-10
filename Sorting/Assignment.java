package Sorting;

public class Assignment {
    public static void bubble_sort(int nums[]){
        for(int turn=0;turn<nums.length-1;turn++){
            for(int i=0;i<nums.length-1-turn;i++){
                if(nums[i]<nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }

        }
    }
    public static void selection_sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int maxpose=i;
            //find the mx elemnt from the array for that turn
            for(int j=i+1;j<nums.length;j++){
                if(nums[maxpose]<nums[j]){
                    maxpose=j;
                }
            }
            int temp=nums[maxpose];
            nums[maxpose]=nums[i];
            nums[i]=temp;
            
        }
    }
    public static void insertion_sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            //find the position to insert
            while(prev>=0 && nums[prev]<curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            //insertion of the current element
            nums[prev+1]=curr;

        }
    }
    public static void counting_sort(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=nums.length-1;
        for(int i=0;i<count.length;i++){
           
            while(count[i]>0){
                nums[j]=i;
                count[i]--;
                j--;
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
        int nums[]={3,6,2,1,8,7,4,5,3,1};
        bubble_sort(nums);
        printarr(nums);
        selection_sort(nums);
        printarr(nums);
        insertion_sort(nums);
        printarr(nums);
        counting_sort(nums);
        printarr(nums);

    }
}
