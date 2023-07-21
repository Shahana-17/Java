package placements;

import java.util.Scanner;

public class Large{
	public static void main(String args[]) {
		int n, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of elements:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
		if(max < a[i])
		{
		max = a[i];
		}
		}
		System.out.println("Largest value in the array:"+max);
		}
		}