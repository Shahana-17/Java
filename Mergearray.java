package placements;
import java.util.*;
public class Mergearray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        String[] array1 = new String[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.next();
        }
        // Second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        String[] array2 = new String[size2];

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.next();
        }
        // Merge arrays
        String[] mergedArray = new String[size1 + size2];
        int index = 0;
        for (int i = 0; i < size1; i++) {
            mergedArray[index++] = array1[i];
            if (i < size2) {
                mergedArray[index++] = array2[i];
            }
        }
        while (index < size1 + size2) {
            mergedArray[index++] = array2[index-size1-1];
        }
        // Print merged array
        System.out.print("Merged array: ");
        for (String element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
