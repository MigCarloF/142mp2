import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public BinarySearch(){}

    public int search(int[] arr, int val){
        int index = arr.length / 2;

        return search(arr, val, index);
    }

    public int search(int[] arr, int val, int index){

        if(index == 1){
            if(arr[index - 1] == val){
                return index - 1;
            }
            return -1;
        }

        if(index == arr.length - 1){
            if(arr[index - 2] == val){
                return index - 2;
            }
            if(arr[index - 1] == val){
                return index - 1;
            }
            return -1;
        }

        if(val < arr[index - 1])
            return search(arr, val, index / 2);
        else if (val > arr[index - 1])
            return search(arr, val, (arr.length - index) / 2) + index;
        else
            return index - 1;
    }

}
