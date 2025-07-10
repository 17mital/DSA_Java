import java.util.Arrays;

public class twosum {
    public static void twosum(int nums[], int target){
        int[][] nums2 = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            nums2[i][0]=nums[i];
            nums2[i][1]=i;
        }
        Arrays.sort(nums2,(a, b) -> Integer.compare(a[0], b[0]));
        int start=0;
        int end=nums2.length-1;
        while(start<end){
            int sum=nums2[start][0]+nums2[end][0];
            if(sum==target){
                System.out.println(" target sum found at "+nums2[start][1]+","+ nums2[end][1]);
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }

        }
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        twosum(nums, target);
        System.out.println("Hello" +" \n" +"World");

    }
    
}
