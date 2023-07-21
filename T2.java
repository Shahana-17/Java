package placements;
import java.util.*;
public class T2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String str=sc.nextLine();
	     String[] wd=str.split(" ");
	     String ans ="";
	     int wl=wd.length;
	      for (int i=wl-1;i>=0;i--) 
	      {
	         ans+=wd[i]+" ";
	      }
	      System.out.println(ans);
	}
}
