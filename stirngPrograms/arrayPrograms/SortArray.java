package stirngPrograms.arrayPrograms;

import java.util.Arrays;

public class SortArray {
    public int[] sortedArray(int[] arr) {
        int[] sortedarr = Arrays.stream(arr).sorted().toArray();
        return sortedarr;
    }

    public int[] sortedArrayUsingLoop(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

//    public int[] halfInAscHalfInDesc(int[] arr) {
//        int length = arr.length;
//        int[] sortedArray = new int[length];
//        int count = 0;
//        for (int x = 0; x < arr.length / 2; x++) {
//
//            for(int j=0;j<arr.length;j++){
//
//            }
//
//
//            count++;
//
//        }
//    }
}
