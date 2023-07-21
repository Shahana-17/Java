package placements;
import java.util.*;
public class Formula 
{
	public static void main(String[] args) 
	{
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the starting value of n: ");
		        long n = sc.nextLong();
		        long t = 0, p = 0, h = 0;
		        while (true) {
		            t = n * (n + 1) / 2; 
		            p = n * (3 * n - 1) / 2;
		            h = n * (2 * n - 1);

		            if (t == p && p == h) 
		            {
		 
		                System.out.println("Number " + t);
		                break;
		            }
		            n++;
		        }
		    }
		}
