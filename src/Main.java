import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Choose sorting algorithm
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sorting array using Bubble Sort:");
                BubbleSort.sort(array.clone()); // clone to keep original array
                break;
            case 2:
                System.out.println("Sorting array using Selection Sort:");
                SelectionSort.sort(array.clone()); // clone to keep original array
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                break;
        }

        scanner.close();
    }
}
