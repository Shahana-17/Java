package placements;
import java.util.*;
public class Mixedfraction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1!=0&&n2!=0&&n3!=0) {
			int ans=((n3*n1)+n2);
			System.out.print(ans+"/"+n3);
		}
		else {
			System.out.print("Invalid input");
		}
	}
}
