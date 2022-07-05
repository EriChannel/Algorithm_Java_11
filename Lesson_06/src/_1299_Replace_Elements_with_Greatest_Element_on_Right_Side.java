import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {

        int[] result = new int[arr.length];
        for(int i = 0; i < result.length; i++){
            result[i] = findMax(arr, i+1);
        }
        return result;
    }

    public static int findMax(int[] arr, int startIndex){
        if(startIndex == arr.length){
            return -1;
        }

        int max = arr[startIndex];
        for(int i = startIndex; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
