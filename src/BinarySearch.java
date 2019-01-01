import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public BinarySearch(){}

    public int search(int[] arr, int val){
        return search(arr, val, 0, arr.length - 1);
    }

    public int search(int[] arr, int val, int low, int high){
        int cmp = low + ((high - low) / 2);

        if (low > high)
            return -1;
        else if(val < arr[cmp])
            return search(arr, val, low, cmp - 1);
        else if (val > arr[cmp])
            return search(arr, val, cmp + 1, high);
        else
            return cmp;
    }
}