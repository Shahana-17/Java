package placements;
import java.util.*;
public class Gcdrecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int gcd;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         gcd=getgcd(n1,n2);
        System.out.print(gcd);
	}
	public static int getgcd(int n1,int n2) {
		if(n2!=0) {
			return getgcd(n2,n1%n2);
		}
		else {
			return n1;
		}
	}
}
