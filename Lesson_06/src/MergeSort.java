import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] nums1 = {6,25,30,45};
//        int[] nums2 = {11, 15, 90};
//
//        int[] result = merge(nums1, nums2);
//        System.out.println(Arrays.toString(result));

        int[] nums = {25,30,45,6,11,90,15};
        int[] result = mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(result));


    }

    public static int[] sortArray(int[] nums) {
        int[] result = mergeSort(nums, 0, nums.length-1);
        return result;
    }

    public static int[] mergeSort(int[] nums, int iLeft, int iRight) {

        //Điều kiện dừng: mảng chỉ có 1 phần tử
        if (iLeft == iRight) {
            int[] singleElement = {nums[iLeft]};
            return singleElement;
        }

        //Chia mảng
        int iMid = (iLeft + iRight) / 2;

        int[] nums1 = mergeSort(nums, iLeft, iMid);
        int[] nums2 = mergeSort(nums, iMid + 1, iRight);

        //Gộp mảng
        int[] result = merge(nums1, nums2);
        return result;
    }

    //Gộp mảng
    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] result = new int[n];
        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while (i < n) {
            //Trường hợp hai mảng không rỗng
            if (i1 < nums1.length && i2 < nums2.length){
                if(nums1[i1] < nums2[i2]){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            //Trường hợp 1 trong hai mảng rỗng
            }else {
                //TH: Mảng nums1 khác rỗng, mảng nums2 rỗng
                if(i1 < nums1.length){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                }else { //TH: mảng nums1 rỗng, mảng nums2 khác rỗng
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }

            }
        }
        return result;
    }
}