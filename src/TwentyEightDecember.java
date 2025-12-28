public class TwentyEightDecember {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("null");
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
    }
}
