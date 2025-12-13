import java.util.*;

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

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();

        for (int num : nums) {
            if (duplicate.contains(num)) {
                return true;
            }
            duplicate.add(num);
        }

        return false;
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        int[] nums1 = {5, 6, 7, 1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 1, 5, 5, 2, 2, 6, 8, 8};
        int k = 4;
        System.out.println("The Original Array is: " + Arrays.toString(nums));
        rotateArray(nums, k);
        System.out.println("The Rotated Array is: " + Arrays.toString(nums) + " by " + k + " Steps");

        System.out.println("Is Duplicate Present in Array: " + containsDuplicate(nums));

        System.out.println(singleNumber(nums2));
    }
}
