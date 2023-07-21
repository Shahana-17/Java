package placements;
import java.util.*;
public class T1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) 
        {
            if(a[i]==0&&(i==0||a[i-1]==1)) 
            {
                for(int j=i;j<n;j++)
                {
                    a[j]=1-a[j];
                }
                count++;
            }
        }
        System.out.print(count);	
	}
}


