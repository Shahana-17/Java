package pc;
import java.util.*;
public class Unitdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
		for (int i =start; i <=end; i++)   
		{       
			if (i%10==k)
			{
                count++;
            }
		}   
		System.out.println(count);
	}
}
