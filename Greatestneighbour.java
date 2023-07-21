package placements;
import java.util.*;
public class Greatestneighbour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int arr[]=new int[n+1];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( i=0;i<n-1;i++)
        {
           if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
           {
                System.out.print(arr[i]+" ");
           }
        }
        if(arr[n-1]>arr[n-2]) {
        	System.out.println(arr[i]);	
        }   
	}
}