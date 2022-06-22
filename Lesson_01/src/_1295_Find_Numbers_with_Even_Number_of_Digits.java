public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums){
            if(countDigit(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int countDigit(int number){
        int count = 0;
        while (number != 0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        int count = findNumbers(nums);
        System.out.println(count);
//        int number = 1234;
//
//        String s = String.valueOf(number);
//        System.out.println(s.length());
//
//        int count = 0;
//        while (number != 0){
//            number = number/10;
//            count++;
//        }
//
//        System.out.println(count);
    }
}
