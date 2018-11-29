import java.util.Scanner;

public class BinarySearchUI {

    public BinarySearchUI() {
        int size;
        Scanner sc = new Scanner(System.in);

        do {
            size = sc.nextInt();
        } while (size < 1);

        int[] array = new int[size];

        BinarySearch binarySearch = new BinarySearch();

        int output = binarySearch.search(array,  4);

    }

}
