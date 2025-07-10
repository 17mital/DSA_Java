public class Assignment_q2 {
    public int search(int nums[] ,int target){
        int min=minsearch(nums);
        if(nums[min]<=target && target <=nums[nums.length-1]){
            return search(nums,min,nums.length-1, target);
        }else{
            return search(nums,0,min-1, target);
        }
    }
    public int search(int nums[] , int left, int right , int target){
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid] > target) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    public int minsearch(int nums[]){
        int left=0 , right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid>0 && nums[mid-1] >nums[mid])return mid;
            else if(nums[left] <=nums[mid]&& nums[mid] >nums[right])
            left=mid+1;
            else right=mid-1;
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[] ={4,5,6,7,0,1,2};
        int target=0;
        Assignment_q2 obj = new Assignment_q2();
        int n=obj.search(nums, target);
        System.out.println("Target is found at the index :"+ n);

        
    }
    
    
}
