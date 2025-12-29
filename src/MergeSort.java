import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                merged[x] = arr[index1];
                x++;
                index1++;
            } else {
                merged[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while (index1 <= mid) {
            merged[x] = arr[index1];
            x++;
            index1++;
        }

        while (index2 <= end) {
            merged[x] = arr[index2];
            x++;
            index2++;
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        divide(arr, 0, arr.length - 1);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff == minDiff) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 1, 8, 9, 7};

//        divide(arr, 0, arr.length - 1);

        System.out.println(minimumAbsDifference(arr));
        for (int j : arr) {
            System.out.print(j + "==>");
        }
        System.out.println("null");


    }
}
