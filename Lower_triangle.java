package placements;

public class Lower_triangle {

	public static void main(String[] args) {
		int rows, cols;   
        int a[][] = {     
                        {1, 2, 3},  
                        {8, 6, 4},  
                        {4, 5, 6}  
                    };  
          rows = a.length;  
        cols = a[0].length;           
        if(rows != cols){  
            System.out.println("Matrix should be a square matrix");  
        }  
        else {  
            System.out.println("Lower triangular matrix: ");  
            for(int i = 0; i < rows; i++){  
                for(int j = 0; j < cols; j++){  
                  if(i < j)  
                    System.out.print(" ");  
                  else  
                    System.out.print(a[i][j] + " ");  
                }  
                System.out.println();  
            }  
        }  
    }  
}

	


