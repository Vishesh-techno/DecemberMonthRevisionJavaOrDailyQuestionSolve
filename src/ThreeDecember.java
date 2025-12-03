import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeDecember {
    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//

        // 2nd Method Optimized

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int RequiredNo = target - nums[i];

            if (map.containsKey(RequiredNo)) {
                return new int[]{i, map.get(RequiredNo)};
            }

            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 15)));
    }
}
