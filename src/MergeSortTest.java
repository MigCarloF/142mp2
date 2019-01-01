import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSortTest(){
        assertTrue(true);
    }

    @Test
    void mergeSortTestSize5() {

        int[] arr = new int[] {1, 4, 2, 9, 5};


        arr = new MergeSort().mergeSort(arr);

        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(5, arr[3]);
        assertEquals(9, arr[4]);

    }

    @Test
    void mergeSortTestSize1() {

        int[] arr = new int[] {1};

        arr = new MergeSort().mergeSort(arr);

        assertEquals(1, arr[0]);

    }

    @Test
    void mergeSortTestSize2(){

        int[] arr = new int[] {2, 1};

        arr = new MergeSort().mergeSort(arr);

        assertEquals(1, arr[0]);
        assertEquals(2, arr[1]);
    }
}