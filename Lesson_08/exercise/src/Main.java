public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(arr[2]); //O(1)

        for(int i = 0; i < arr.length; i++){  //O(n)
            if(arr[i] == 3){
                System.out.println(arr);
            }
        }

        for(int i = 0; i < arr.length; i++){  //O(n)
            if(arr[i] == 3){
                System.out.println(arr);
            }
        }

        for(int i = 0; i < 10; i++){   //O(n^2)
            for (int j = 0; j < 10; j++){
                System.out.println("abc");
            }
        }
    }
}