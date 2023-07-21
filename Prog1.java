package placements;
import java.util.*;
public class Prog1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (isPerfectSquare(sum)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isPerfectSquare(int n){
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
