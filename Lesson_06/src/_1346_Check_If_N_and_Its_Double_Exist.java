public class _1346_Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = i + 1; j < arr.length; j ++) {
                if(arr[i] * arr[i] > arr[j] * arr[j]) {
                    if(arr[i] == 2 * arr[j]) {
                        return true;
                    }
                } else {
                    if(arr[j] == 2 * arr[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
