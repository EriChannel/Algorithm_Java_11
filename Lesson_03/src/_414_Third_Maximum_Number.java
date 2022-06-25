import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        if(n == 1){//trường hợp mảng chỉ có 1 phần tử
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);

        }else {
            Arrays.sort(nums);
            int count = 0;
             int temp = 0;

             for(int i = n-1; i > 0; i--){
                 if(nums[i] != nums[i-1]){
                     count++;
                 }

                 if(count <= 1){
                     temp = nums[n-1];
                 }
                 if(count == 2){
                     temp = nums[i-1];
                 }
             }
             return temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
