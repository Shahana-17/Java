package placements;
import java.util.*;
public class Plumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int rust=sc.nextInt();
		int inc[]=new int[n1];
		int out[]=new int[n2];
		int suminc=0,sumout=0,ans;
		for(int i=0;i<n1;i++) {
			inc[i]=sc.nextInt()-rust;
			 suminc+=inc[i];
		}
		for(int i=0;i<n2;i++) {
			out[i]=sc.nextInt()-rust;
			sumout+=out[i];
		}
		
		if(suminc>sumout) {
			ans=(suminc-sumout)+2;
			System.out.print("-"+ans);

		}
		else if(suminc>sumout) {
			ans=(sumout-suminc)+2;
			System.out.print(ans);

		}
		else {
			System.out.print("BALANCED");
		}
		
	}

}
