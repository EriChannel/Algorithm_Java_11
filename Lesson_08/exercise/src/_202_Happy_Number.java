public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        int sum = 0;
        int num = 0;

        while (n > 6){
            while (n > 0){
                num = n%10;
                //System.out.println(num);
                sum = sum + num*num;
                //System.out.println(sum);
                n = n / 10;
            }

            n = sum;
            sum = 0;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
