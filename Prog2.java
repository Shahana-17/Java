package placements;
import java.util.*;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
        	int r=(int)Math.sqrt(arr[i]);
        	if(r*r==arr[i])
			 {
				 count++;
			 }
        }
        int ans=count+1;
        System.out.println(ans);
	}}
		
	
		