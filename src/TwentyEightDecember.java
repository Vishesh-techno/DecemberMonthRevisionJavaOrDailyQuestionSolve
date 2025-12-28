public class TwentyEightDecember {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "==>");
        }
        System.out.println("null");
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
//        for(int i=0; i<n-1; i++){
//            for(int j=0; j<n-i-1; j++){
//                if(nums[j] > nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < n - 1; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            int temp = nums[small];
            nums[small] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

//        bubble sort
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j] > arr[j+1]){
////                    swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
        printArray(arr);

//        Selection Sort
//        for(int i=0; i<arr.length-1; i++){
//            int small = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[small] > arr[j]){
//                    small = j;
//                }
//            }
//            int temp = arr[small];
//            arr[small] = arr[i];
//            arr[i] = temp;
//        }
//        printArray(arr);

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        printArray(arr);

        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        printArray(nums);
    }
}
