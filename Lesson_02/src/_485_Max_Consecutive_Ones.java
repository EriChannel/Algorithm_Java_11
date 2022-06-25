import java.util.Arrays;

public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;

        for(int i : nums){
            if(i == 1) {
                sum++;
                max = Math.max(sum, max);
            }else { // i == 0
                sum = 0;
            }
        }
        return max;
    }


    public static int findMaxConsecutiveOnes_2(int[] nums) {
        int max = 0;
        for (int i = 0 ; i < nums.length; i++){
            int consOne = 0;
            while (i < nums.length && nums[i] == 1){
                consOne++;
                i++;
            }
            max = Math.max(consOne, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

        System.out.println(findMaxConsecutiveOnes_2(nums));
    }
}
