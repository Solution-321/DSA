package search;

//Time complexitiy= O(log n)
public class BinarySearch {
    public static void main(String[] args) {
        //should pass sorted array for binary search
        int[] nums = {5, 7, 9, 11, 13};
        int target = 11;
        int result = binarysearch(nums, target);
        if (result != -1)
            System.out.println("Element found at Index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1;
    }
}
