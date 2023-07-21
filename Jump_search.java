package placements;
import java.util.*;
public class Jump_search {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in); 
		   System.out.println("Enter size of array:");
		   int n=sc.nextInt();
		   int a[]=new int[n];
		   System.out.println("Enter the elements:");
		   for(int i=0;i<n;i++)
		   {
		     a[i]=sc.nextInt();
		   }   
		   int block=(int)(Math.sqrt(n));
		   System.out.println("Enter the element to search:");
		   int x=sc.nextInt();
		   if(x>a[n-1] || x<a[0])
		   {
		     System.out.println("is not present in the given list5");
		     return;
		   }
		   int i=0;
		   int j=block;
		   while(a[j]<x && j<n)
		   {
		    i=j;
		    j=j+block; 
		    if(j>n-1)
		    {
		     j=n-1;
		    }
		   
		   }
		   for(int k=i;k<=j;k++)
		    {
		      if(a[k]==x)
		       {
		        System.out.println("Element found at position:"+(k+1));
		         return;
		       }
		    }
		   System.out.printf(  "is not present in the given list");
		   
		  }
		}
	
		
