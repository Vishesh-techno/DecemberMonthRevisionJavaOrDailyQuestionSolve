import java.util.Arrays;

public class ThirteenDecember {
    public static void rotateArray(int[] nums, int k) {
        k = k % nums.length;
        revNumber(nums, 0, nums.length - 1);
        revNumber(nums, 0, k - 1);
        revNumber(nums, k, nums.length - 1);
    }

    public static void revNumber(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        int k = 4;
        System.out.println("The Original Array is: " + Arrays.toString(nums));
        rotateArray(nums, k);
        System.out.println("The Rotated Array is: " + Arrays.toString(nums) + " by " + k + " Steps");
    }
}
