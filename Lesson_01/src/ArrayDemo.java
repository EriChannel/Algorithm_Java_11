import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] rs = insert(array, 6, 2);
        System.out.println(Arrays.toString(rs));

        int n = delete(rs, 3);
        for (int i = 0; i < n ; i++){
            System.out.print(rs[i] + "\t");
        }
    }

    //Thêm phần tư vào cuối mảng
    public static int[] insert (int[] arr, int x){
        int[] result = new int[arr.length+1];
        for(int i = 0; i < result.length; i ++) {
            if(i != (result.length -1)) {
                result[i] = arr[i];
            } else {
                result[i] = x;
            }
        }

        return result;
    }

    //Thêm vào vị trí bất kỳ
    public static int[] insert(int[] arr, int x, int position){

        int[] result = Arrays.copyOf(arr, arr.length+1);
        //Kiểm tra vị trí có hợp lệ hay không
//        for (int i = position;i< result.length-1;i++){
//            result[i+1] = arr[i];
//        }
        if(position >= 0 && position < result.length-1){
            for(int i = arr.length; i > position; i--){
                result[i] = arr[i-1];
            }

            result[position] = x;
        }


        return result;
    }

    //Xóa phần tử mảng, trả về số phần tử còn lại sau khi xóa
    public static int delete(int[] arr, int x){
        int n = arr.length;
        //Tìm phần tử cần xóa
        int position = search(arr, x);
        //TH1: Không tìm thấy phần tử cần xóa
        if(position == -1){
            return n;
        }
        System.out.println();
        //TH2: Tìm thấy phần tử cần xóa
        for (int i = position; i < n-1; i++){
            arr[i] = arr[i+1];
        }

        return n-1;
    }

    public static int search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
