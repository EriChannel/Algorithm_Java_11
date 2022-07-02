public class Main {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10};

       int x = 8;

       long start = System.nanoTime();
        //System.out.println(search(arr, x));

        System.out.println(binarySearch(arr, x));

        long end = System.nanoTime();

        System.out.println(end - start);
    }


    //Tìm kiếm tuyến tính
    public static int search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[]arr, int x){
        int n = arr.length;
        int iLeft = 0;
        int iRight = n-1;

        while (iLeft <= iRight){
            int key = (iLeft+iRight)/2;

            System.out.println("left = " + iLeft);
            System.out.println("right = " + iRight);
            System.out.println("key = " + key);

            if(arr[key] == x){
                return key;
            }else if(arr[key] < x){
                iLeft = key+1;
            } else{ //arr[key] > x
                iRight = key - 1;
            }
        }
        return -1;
    }
}