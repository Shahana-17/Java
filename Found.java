package placements;
import java.util.*;
public class Found {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int i,k;
		int flag=0;
	System.out.println("Enter the number of elements:") ;
		int n = sc.nextInt();
	int[] a = new int[n];
		System.out.println("Enter the elements") ;
		for(i=0;i<n;i++)
		{
    		a[i] = sc.nextInt();
		}
	System.out.println("Enter the element to be seached");
	k= sc.nextInt();
		for(i=0;i<n;i++)
		{
    		if(a[i]==k)
    		{
        			System.out.println("Element is found at index :"+i);
        			flag=1;
        			break;
    		}
		
		else
		if(flag==0)
		{
    		System.out.println("Element "+k+" not found");
		}}
		
}
}