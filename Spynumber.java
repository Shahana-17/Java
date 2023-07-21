package placements;
import java.util.*;
public class Spynumber {
	public static void main(String[] args) {
		int sum=0;
		int product =1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
			int lastdigit=num%10;
			sum+=lastdigit;
			product*=lastdigit;
			num=num/10;  
		}
		if(sum==product) {
			System.out.println("Spynumber");
		}
		else {
			System.out.println(" Not a spynumber");
		}
	}

}
