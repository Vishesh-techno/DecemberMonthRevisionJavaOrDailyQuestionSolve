import java.util.Arrays;

public class TwelveDecember {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }

            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static int removeDuplicates(int[] nums) {
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }

    public static int maxProfitII(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
//            if (prices[i + 1] > prices[i]) {
//                int currProfit = prices[i + 1] - prices[i];
//                profit = profit + currProfit;
//            }

//         2nd Method
         int diff = prices[i+1] - prices[i];
         if(diff > 0){
             profit = profit + diff;
         }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr = {7, 1, 5, 3, 6, 4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("The Max Profit is: " + maxProfit(arr));
        System.out.println("The Max Profit is for IInd: " + maxProfitII(arr));
    }
}
