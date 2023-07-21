package placements;
import java.util.*;
public class Prog02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a1,a2,a3,a4;
        a1=m2+n2; 
		a2=m2-n2;
		a3=m1*n1-m2*n2;
		a4=m1*n2+m2*n1;
		System.out.print(m1+n1);
		System.out.println("+" +a1 +"i");
		System.out.print(a3+"+" +a4+"i");
        }}
//to cal no of words in a gn sentence based on which cal the no of vowel and 
//also print the total no of vowel letters 
       