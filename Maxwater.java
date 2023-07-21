package pc;
import java.util.*;
public class Maxwater {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] h = new int[n];
	        for (int i = 0; i < n; i++) {
	            h[i] = sc.nextInt();
	        }
	        int maxWater = 0;
	        for (int i = 1; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                int water = (j - i) * Math.min(h[i], h[j]);
	                if (water > maxWater) {
	                    maxWater = water;
	                }
	            }
	        }
	        System.out.println( maxWater);
	    }
	}
Scanner obj=new Scanner(System.in);
int n,i,s1=0,s2=0,s3=0;
n=8;
int b[]=new int[n+1];
for(i=0;i<8;i++)
{
    b[i]=obj.nextInt();
}
int c1[]=new int[3];
int c2[]=new int[3];
int c3[]=new int[2];
for(i=0;i<3;i++)
{
    c1[i]=b[i];
    s1+=b[i];
}
for(i=0;i<3;i++)
{
    c2[i]=b[i+3];
    s2+=b[i+3];
}
for(i=0;i<2;i++)
{
    c3[i]=b[i+6];
    s3+=b[i+6];
}
if(s1==s2)
{
    if(b[6]<b[7])
    {
        System.out.println("ball 7 is defective");
    }
    else 
    {
        System.out.println("ball 8 is defective");
    }
}
else if(s1<s2)
{
    if(b[0]<b[1])
    {
        System.out.println("ball 1 is defective");
    }
    else if(b[0]>b[1])
    {
        System.out.println("ball 2 is defective");
    }
    else if(b[0]==b[1])
    {
        System.out.println("ball 3 is defective");
    }
}
else if(s1>s2)
{
    if(b[3]==b[4])
    {
        System.out.println("ball 6 is defective");
    }
    else if(b[3]>b[4])
    {
        System.out.println("ball 5 is defective");
    }
    else if(b[3]<b[4])
    {
        System.out.println("ball 4 is defective");
    }
       }
    }
}
