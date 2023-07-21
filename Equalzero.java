package placements;
import java.util.*;
public class Equalzero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(((arr[i]+arr[j]+arr[k])==0) )
                    {
                        flag=1;
                        System.out.println(arr[i]+" "+arr[j]+ " "+arr[k]);
                    }
                }
            }
        }
        if(flag==0) {
        	System.out.print("No Elements Found");
        }}}

