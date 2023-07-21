package placements;
import java.util.*;
public class Insert {
	public static void main(String args[]) {
		 int k,ele;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no of elements:");
	        k= sc.nextInt();
	        int arr[] = new int[k+1];
	        System.out.println("Enter "+k+" elements:");
	        for(int i = 0; i < k; i++)
	        {
	            arr[i] = sc.nextInt();
	        }
	        System.out.print("Enter the element which you want to insert:");
	        ele = sc.nextInt();
	        arr[k] = ele;
	        System.out.print("After inserting : ");
	        for(int i = 0; i <k; i++)
	        {
	            System.out.print(arr[i]+",");
	        }
	        System.out.print(arr[k]);	       
	    }
	}