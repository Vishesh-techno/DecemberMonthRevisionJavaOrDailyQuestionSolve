import java.util.*;

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
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0, j = 0, k = 0;
//        int[] res = new int[Math.min(nums1.length, nums2.length)];
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] == nums2[j]) {
//                res[k] = nums1[i];
//                k++;
//                i++;
//                j++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                i++;
//            }
//        }
//        return Arrays.copyOfRange(res, 0, k);

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) == 1) {
                    map.remove(num);
                } else {
                    map.put(num, map.get(num) - 1);
                }
                list.add(num);
            }
        }
        int[] arr = new int[list.size()];
        int counter = 0;
        for (int j : list) {
            arr[counter] = j;
            counter++;
        }
        return arr;
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
