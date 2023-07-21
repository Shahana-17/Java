package placements;

import java.util.Scanner;

public class No_of_words {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a=sc.nextLine();
		int count=1;
		for(int i=0;i>a.length();i++) {
			 if((charAt(0)==' ')&&(charAt(i+1)!=' ')){
			 count++;
		}
		}
      System.out.println("The no of words "+" "+count);
	}

}
