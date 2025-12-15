import java.util.Arrays;

public class FifteenDecember {
    public static void duplicateZeros(int[] arr) {
        int[] dest = new int[arr.length];

        int s = 0, d = 0;

        while (s < arr.length) {
            if (arr[s] == 0) {
                if (d < arr.length) {
                    dest[d] = 0;
                }
                d++;
                if (d < arr.length) {
                    dest[d] = 0;
                }
            } else {
                if (d < arr.length) {
                    dest[d] = arr[s];
                }
            }
            d++;
            s++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = dest[i];
        }
    }

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static boolean checkIfExist(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 2 * nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(nums, 0));
        System.out.println(checkIfExist(nums));
    }
}
