package placements;
import java.util.*;
public class Fact {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0,flag=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
	}