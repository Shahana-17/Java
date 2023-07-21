package placements;
import java.util.*;
public class Monkey {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int ban=m%k;
        int q=m/k;
        int mc=0,r=0;
        int q2=p/j;
        int pea=p%j;
        if(ban!=0 || pea!=0)
        {
            r=1;
        }
        mc=q+q2+r;
        int ans=n-mc;
    System.out.print(ans);
	}

}
