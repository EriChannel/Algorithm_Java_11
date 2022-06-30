public class Main {
    public static void main(String[] args) {
        //recursion();

        long start = System.nanoTime();
        //System.out.println(factorial(5));
        System.out.println(giaiThua(5));
        long end = System.nanoTime();

        System.out.println(end - start);
        //

        for (int i = 0; i < 10; i++) {
           // System.out.println(fibonacci(i));
            System.out.println(fib(i));
        }


    }

//    public static void recursion(){
//        System.out.println("Đệ quy");
//        recursion();


    //    }
    public static int factorial(int n) {
        //Điều kiện dừng
        if (n == 0) {
            return 1;
        } else { //n != 0
            return n * factorial(n - 1);

        }
    }

    public static int giaiThua(int n) {
        int factorial = 1;
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    public static int fibonacci(int n) {
        //Xác định điều kiện dừng
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {//Xác định công thức đệ quy
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n == 0 || n == 1){
            return n;
        }else {
            for(int i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0+f1;
            }
        }
        return fn;
    }
}