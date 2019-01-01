import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testSearchSize5() throws Exception{
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

    @Test
    public void testSearchSize10() throws Exception{
        int[] arvin = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinarySearch binarySearch = new BinarySearch();
        int val = binarySearch.search(arvin,  12);

        assertEquals(-1, val);

        val = binarySearch.search(arvin,  1);
        assertEquals(0, val);

        val = binarySearch.search(arvin,  2);
        assertEquals(1, val);

        val = binarySearch.search(arvin,  3);
        assertEquals(2, val);

        val = binarySearch.search(arvin,  4);
        assertEquals(3, val);

        val = binarySearch.search(arvin,  5);
        assertEquals(4, val);

        val = binarySearch.search(arvin,  6);
        assertEquals(5, val);

        val = binarySearch.search(arvin,  7);
        assertEquals(6, val);

        val = binarySearch.search(arvin,  8);
        assertEquals(7, val);

        val = binarySearch.search(arvin,  9);
        assertEquals(8, val);

        val = binarySearch.search(arvin,  10);
        assertEquals(9, val);

    }
}