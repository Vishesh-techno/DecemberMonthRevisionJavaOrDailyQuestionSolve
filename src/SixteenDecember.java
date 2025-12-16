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

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};

        System.out.println(checkIfExist(arr));
    }
}
