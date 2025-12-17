public class SeventeenDecember {

    public static int findPivotIndex(int[] nums) {
        int rightSum = 0, leftSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != idx && max < 2 * nums[i]) {
                return -1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(findPivotIndex(nums));
        System.out.println(dominantIndex(nums));
    }
}
