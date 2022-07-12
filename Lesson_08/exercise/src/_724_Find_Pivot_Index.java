public class _724_Find_Pivot_Index {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            leftSum += nums[i];

            int rightSum = sum - leftSum + nums[i];

            if(rightSum == leftSum)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
