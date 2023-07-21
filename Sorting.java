package pc;
import java.util.*;
public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i]=sc.nextInt();
        }  
		for (int i=0;i<array.length;i++)   
		{       
		  
		  System.out.print(array[i]+" ");   
		}   

	}

}
