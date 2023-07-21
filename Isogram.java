package placements;
import java.util.*;
public class Isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		String a=sc.nextLine();
		a=a.toLowerCase();
		char c[]=a.toCharArray();
		Arrays.sort(c);
        for (int i = 0; i <a.length() - 1; i++) {
            if (c[i] == c[i + 1]) {
            	flag=1;
            	 System.out.println(" Not Isogram");
            	break;
            }
            else {
        		            
        System.out.println("Isogram");}

		
		 

	}

}
}