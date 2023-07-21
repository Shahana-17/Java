package placements;
import java.util.*;
public class Order {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++) {
		      if(a.charAt(i)==a.charAt(j)) {      
				                   count++;
				               }
				           }
			System.out.println(count);
			}
				           
				   }
				}



       
    