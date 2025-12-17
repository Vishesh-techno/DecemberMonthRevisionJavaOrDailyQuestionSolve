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

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(findPivotIndex(nums));
    }
}
