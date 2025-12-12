public class TwelveDecember {
    public static int removeDuplicates(int[] nums){
        int a = 1;
        for (int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int nums1 = removeDuplicates(nums);

        System.out.println(nums1);
    }
}
