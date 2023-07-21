package placements;
import java.util.*;
public class Program01 {
		  public static void main (String[] args)
		  {
			  int[][] matrix = new int[3][3];
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter matrix elements:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                matrix[i][j] = sc.nextInt();
		            }
		        }

		        int[] m= new int[9];
		        int in= 0;
		        for (int i = 0; i < 3; i++) {
		            if (i % 2 == 0) {
		                for (int j = 0; j < 3; j++) {
		                    m[in++] = matrix[j][i];
		                }
		            } else {
		                for (int j = 2; j >= 0; j--) {
		                    m[in++] = matrix[j][i];
		                }
		            }
		        }
		        System.out.println("Output:");
		        for (int i = 0; i < 9; i++) {
		           System.out.println(m[i]+" ");
		        }

		  }
		}