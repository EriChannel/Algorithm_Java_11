import java.util.Arrays;

public class DemoSelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,5};

        //int[] sortArr = sort(arr);
        int[] sortArr = sortArray(arr);
        System.out.println(Arrays.toString(sortArr));
    }

    private static int[] sortArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            //tìm phần tử nhỏ nhất
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }

            }
            System.out.println("Phần tử nhỏ nhất: " + arr[minIdx]);

            //Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
