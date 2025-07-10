package Sorting;

import java.util.Arrays;

import java.util.Collections;
public class Inbuilt_sort {
    public static void printArr(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer nums[]={5,3,2,1,4};
        //Arrays.sort(nums);
        //Arrays.sort(nums,0,3);
        //Arrays.sort(nums,Collections.reverseOrder());
        Arrays.sort(nums,2,5,Collections.reverseOrder());
        printArr(nums);

    }
}
