package placements;
import java.util.*;
public class Patient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int age[]=new int[n];
		while(n<20) {
		for(int i=0;i<n;i++) {
			age[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(age[i]>0&&age[i]<17) {
				int fees=200;
				sum+=fees;
			}
			else if(age[i]>=17&&age[i]<40) {
				int fees=400;
				sum+=fees;
			}
			else {
				int fees=300;
				sum+=fees;
			}
		}
      System.out.print("Total Income "+sum+" INR");
	}
	}
}
