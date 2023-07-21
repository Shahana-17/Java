package placements;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number 1: ");
	    int num1= sc.nextInt();
	    System.out.print("Enter a number 2: ");
	    int num2=sc.nextInt();
	    if(num1==num2) {
	    	System.out.println("Equal");
	    }
	    else {
	    	System.out.println("Not equal");
	    }

	}

}