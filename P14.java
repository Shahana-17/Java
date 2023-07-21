package placements;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	    int s;
	    if(num%3==0) {
	    	System.out.println("The number is divisible by 3");
	    }
	    else {
	    	s=num%3;
	    	System.out.println("The number is not divisible by 3  and gives a remainder\t"+s );
	    }


	}

}
