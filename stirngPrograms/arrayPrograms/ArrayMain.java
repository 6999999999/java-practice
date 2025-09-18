package stirngPrograms.arrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        SortArray sortArray= new SortArray();
        int arr[]={12,14,33,5,32};
//        int sortedarr[]=  sortArray.sortedArray(arr);
//        System.out.println(Arrays.toString(sortedarr));

        int sortedarr[]=  sortArray.sortedArrayUsingLoop(arr);
        System.out.println(Arrays.toString(sortedarr));
    }
}
