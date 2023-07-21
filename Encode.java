package placements;
import java.util.*;
public class Encode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int sum=1;
		for(int i=0;i<str.length()-1;i++) {
			if(arr[i]==arr[i+1]) {
				sum++;
			}
			else if(arr[i]!=arr[i+1]) {
				System.out.print((char)arr[i]+""+sum);
				sum=1;
			}
		}
		System.out.print(arr[arr.length-1]+""+sum);
	}
}
