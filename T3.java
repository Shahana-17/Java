package placements;
import java.util.*;
public class T3 {
	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int numRows=sc.nextInt();
		        System.out.print("Enter the number of columns: ");
		        int numCols=sc.nextInt();
		        int[][] array=new int[numRows][numCols];
		        System.out.println("Enter the elements of the array (0 or 1): ");
		        for(int i=0;i<numRows;i++) 
		        {
		            for(int j=0;j<numCols;j++)
		            {
		                array[i][j] =sc.nextInt();
		            }
		        }
		        int rowWithMostOnes=findRowWithMostOnes(array);
		        System.out.println("Row with the most ones: " + rowWithMostOnes);
		    }
		    public static int findRowWithMostOnes(int[][] array) {
		        int rowWithMostOnes=0;
		        int maxOnes=0;
		        for (int i=0;i<array.length;i++) 
		        {
		            int onesCount=0;
		            for (int j=0;j<array[i].length;j++) {
		                if (array[i][j]==1) 
		                {
		                    onesCount++;
		                }
		            }
		            if(onesCount>maxOnes) 
		            {
		                maxOnes=onesCount;
		                rowWithMostOnes=i;
		            }
		        }
		        return rowWithMostOnes;
		    }
}
