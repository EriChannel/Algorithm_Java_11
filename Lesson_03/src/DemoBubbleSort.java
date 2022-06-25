import java.util.Arrays;

public class DemoBubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,2,1,7,5};

        //int[] sortArr = sort(arr);
        int[] sortArr = sortArray(arr);
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] sort(int[] arr){
        int n = arr.length;

        //boolean sorted = false;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Lần lặp thứ " + (i+1));
            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }

    //Cách tối ưu hơn
    public static int[] sortArray(int[] arr){
        int n = arr.length;

        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }

            System.out.println(Arrays.toString(arr));

        }
        return arr;
    }


}
