package placements;
import java.util.Scanner;
public class Pg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Wave Form Matrix:");
        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
