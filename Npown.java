package placements;
import java.util.*;
public class Npown {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int flag=0,k=0,d=0,sum=1;
	    for(int i=0;i<n;i++)
	    {
	        int a=n-(i*i);
	        for(int j=1;j<=a;j++)
	        {
	            for(int r=1;r<=j;r++)
	            {
	                sum*=j;
	            }
	        if(sum==a)
	        {
	            flag=1;
	            k=j;
	            d=i;
	            break;
	        }
	        else 
	        {
	            sum=1;
	        }
	        }
	    }
	    if(flag==1)
	    {
	        System.out.print("Yes"+"\nk="+k+"\nd="+d);
	    }
	    else {
	    	System.out.print("NO");
	    }
	}
}
