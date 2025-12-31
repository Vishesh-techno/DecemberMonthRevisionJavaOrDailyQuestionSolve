public class ThirtyOneDecember {
    public static int guess(int num) {
        if (num == 45) {
            return 0;
        } else if (num > 45) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int rotatedSortedArray(int[] nums, int target) {
        int n = nums.length;

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println("The picked no. is: " + guessNumber(100));

        int[] nums = {4, 2};

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("The idx of Rotated Sorted Array is: " + rotatedSortedArray(nums, 2));
        System.out.println("The idx of Minimun in Rotated Sorted Array is: " + findMin(nums1));
    }
}
