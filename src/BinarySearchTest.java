import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testSearch() throws Exception{
        int[] arvin = new int[] {1, 3, 5, 7, 9};

        BinarySearch binarySearch = new BinarySearch();
        int val = binarySearch.search(arvin,  4);

        assertEquals(-1, val);



        val = binarySearch.search(arvin,  1);
        assertEquals(0, val);

        val = binarySearch.search(arvin,  3);
        assertEquals(1, val);

        val = binarySearch.search(arvin,  5);
        assertEquals(2, val);

        val = binarySearch.search(arvin,  7);
        assertEquals(3, val);

        val = binarySearch.search(arvin,  9);
        assertEquals(4, val);



    }
}