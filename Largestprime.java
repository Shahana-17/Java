package placements;
import java.util.*;
public class Largestprime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int prime=0;
		for(int i=n1+1;i<n2;i++) {
			for(int j=i+1;j<n2;j++) {
			  if(i%2!=0&&i%3!=0||i==2||i==3) {
				  prime=i;			  
			  }
		    }
		}
		System.out.print(prime);
	}
}
