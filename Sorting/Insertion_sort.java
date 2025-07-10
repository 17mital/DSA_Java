package Sorting;

public class Insertion_sort {
    public static void sort(int nums[]) {
        boolean alreadySorted = true;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            // Check if any shifting is required during the sort
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
                alreadySorted = false; // Actual shifting happened
            }

            nums[prev + 1] = curr;
        }

        if (alreadySorted) {
            System.out.println("Array is already sorted");
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5}; // Not fully sorted
        sort(nums);
        printArr(nums);
    }
}
