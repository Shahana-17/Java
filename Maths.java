package pc;
import java.util.*;
public class Maths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++) {
       if( i%3==0&&i%5==0) {
    	   sum+=i;
       }}
        System.out.print(sum);
	}
} 
