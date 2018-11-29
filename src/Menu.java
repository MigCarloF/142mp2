import java.util.Scanner;

public class Menu {

    public Menu(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Searching from a sorted array");
        System.out.println("2. Sorting an array");
        System.out.println("3. Matrix Multiplication");
        System.out.print("Choice: ");

        do{

            choice = sc.nextInt();

        }while(choice > 3 || choice < 1);

        switch (choice){
            case 1:
                new BinarySearch();
                break;
            case 2:
                new MergeSort();
                break;
            case 3:
                break;
                default:
                    throw new IllegalStateException();
        }

    }

}
