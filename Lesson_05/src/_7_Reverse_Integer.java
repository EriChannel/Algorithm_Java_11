public class _7_Reverse_Integer {

    public static void main(String[] args) {
        System.out.println(reverse(-123));

        System.out.println(reverse(120));
    }

    public static int reverse(int x) {

        int reverse = 0;
        int lastReverse = 0;

        boolean isNegative = x < 0;
        if(isNegative){ // chuyển số âm sang số dương
            x = x * -1;
        }

        //Xử lý đảo số
        while (x > 0){
            lastReverse = reverse;
            reverse = reverse * 10 + x%10;

            if(lastReverse > reverse/10){
                return 0;
            }
            x = x/10;

        }


        if(isNegative){ //chuyển số dương sang số âm
            return  reverse * -1;
        }

        return reverse;

    }
}
