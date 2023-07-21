package placements;
import java.util.Scanner;
public class Palindro_string {
	public static void main(String[] args) {
		String str="";
		Scanner sc =new Scanner(System.in);
		String a=sc.nextLine();
		int l=a.length();
		for(int i=l-1;i>=0;i--) {
			 str =str+ a.charAt(i);
		}
		if(a.equalsIgnoreCase(str)) {
			System.out.println("The string "+str+" "+"is a palindrom");
		}
		else {
			System.out.println("The string "+str+" "+"is not a palindrom");
		}
	}
}
