import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FourteenDecember {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            if (s1.contains(num)) {
                s2.add(num);
            }
        }

        int[] res = new int[s2.size()];

        int k = 0;

        for (int num : s2) {
            res[k] = num;
            k++;
        }

        return res;
    }

    public static int[] intersectionII(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res[k] = nums1[i];
                k++;
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOfRange(res, 0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1, 7, 9};
        int[] nums2 = {1, 2, 2, 7, 9};

        int[] k = intersection(nums1, nums2);

        System.out.println(Arrays.toString(intersection(nums1, nums2)));

        System.out.println(Arrays.toString(k));

        System.out.println(Arrays.toString(intersectionII(nums1, nums2)));

    }
}
