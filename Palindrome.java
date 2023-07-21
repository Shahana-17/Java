package placements;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,rem=0;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.print(rev);
		if(n==rev){
			System.out.print("palindrome");
		}
		else {
			System.out.print("not palindrome");
		}
	}
}
