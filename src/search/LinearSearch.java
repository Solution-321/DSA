package search;

//Time complexitiy= O(n)
public class LinearSearch {
    public static void main(String[] args) {
        //Unsorted array
        int[] nums = {13, 11, 5, 8, 7};
        int target = 8;
        int result = linearsearch(nums, target);
        if (result != -1)
            System.out.println("Element found at Index : " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearsearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
