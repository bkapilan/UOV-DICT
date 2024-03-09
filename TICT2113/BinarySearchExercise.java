import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get 10 integers from the user and insert them into an array
        int[] numArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard the invalid input
            }
            int num = scanner.nextInt();
            if (contains(numArray, num)) {
                System.out.println("Duplicate value. Please enter a different value.");
                i--; // decrement i to re-enter the duplicate value
            } else {
                numArray[i] = num;
            }
        }

        // Step 2: Sort the array if it's not already sorted
        Arrays.sort(numArray);
        System.out.println("Sorted array: " + Arrays.toString(numArray));

        // Step 3: Ask user to enter the target value
        System.out.print("Enter the target value: ");
        int target;
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // discard the invalid input
        }
        target = scanner.nextInt();

        // Step 4: Perform binary search to find the index of the target value
        int index = binarySearch(numArray, target);

        // Step 5: Display the index of the target value
        if (index != -1) {
            System.out.println("Index of the target is: " + index);
        } else {
            System.out.println("Target value not found in the array.");
        }

        scanner.close();
    }

    // Method to check if an array contains a specific element
    private static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    // Binary search algorithm
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }
}
