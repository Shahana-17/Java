package placements;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int num = sc.nextInt();
	    String sign = (num > 0) ? "positive" : (num < 0) ?"negative":"zero";
	    System.out.println(sign);


	}

}
