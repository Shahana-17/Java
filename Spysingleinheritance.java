package placements;
import java.util.*;
class sum{
	void sum() {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int lastdigit=num%10;
		sum+=lastdigit;
	}
	
}
class product extends sum{
	void product() {
	int product=1;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int lastdigit=num%10;
	product*=lastdigit;
	}
}
public class Spysingleinheritance {
	public static void main(String[] args) {
		product sn=new product();
		sn.sum();
		sn.product();
	}
}
  