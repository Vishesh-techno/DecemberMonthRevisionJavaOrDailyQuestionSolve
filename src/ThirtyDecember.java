import java.util.ArrayList;
import java.util.Arrays;

public class ThirtyDecember {
    public static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //    34. Find First and Last Position of Element in Sorted Array
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        int leftSearch = search(nums, target, true);
        int rightSearch = search(nums, target, false);

        res[0] = leftSearch;
        res[1] = rightSearch;

        return res;
    }

    public static int search(int[] nums, int target, boolean isLeft) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                idx = mid;

                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums1 = {5, 7, 7, 8, 8, 10};

        System.out.println(binarySearch(nums, 9));
        System.out.println(Arrays.toString(searchRange(nums1, 7)));
    }
}
