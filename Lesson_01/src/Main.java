import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 5;
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }

       show(arr, n);

        n = insert(arr, 9, n, 2);
        System.out.println(n);
        show(arr, n);
    }

    public static void show(int[]arr, int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int insert(int[] arr, int x, int n, int position){
        //Kiểm tra vị trí cần thêm
        if(position < 0 || position > n){
            return n;
        }

        //Thêm phần tử
        for(int i = n; i > position; i--){
            arr[i] = arr[i-1];
        }

        //chèn phần tử x
        arr[position] = x;

        return n+1;
    }
}