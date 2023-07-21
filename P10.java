package placements;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int num = sc.nextInt();
	    String sign = (num > 0) ? "+" : (num < 0) ?"":"";
	    System.out.println(sign + num);

	}

}
