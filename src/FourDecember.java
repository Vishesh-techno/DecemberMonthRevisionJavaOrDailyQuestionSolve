import java.util.Arrays;

public class FourDecember {
    public static void moveZeros(int[] nums) {
        int k = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[k] = num;
                k++;
            }
        }
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 5, 6, 0, 0, 8, 9};

        moveZeros(nums);
        System.out.println(Arrays.toString(nums));

        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
