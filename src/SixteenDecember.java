import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SixteenDecember {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(2 * num) || set.contains(num / 2) && (num % 2 == 0)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static boolean validMountainArray(int[] arr) {
        int i = 0, n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static int[] replaceElements(int[] nums) {
        int max = -1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = max;
            max = Math.max(max, temp);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};

        System.out.println(checkIfExist(arr));

        System.out.println(validMountainArray(arr));

        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
