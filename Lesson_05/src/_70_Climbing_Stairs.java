public class _70_Climbing_Stairs {
    public static int climbStairs(int n) {
        int[] arr = new int[46];
        arr[1] = 1;
        arr[2] = 2;

        for(int  i = 3; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
