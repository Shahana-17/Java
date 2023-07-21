package pc;
import java.util.*;
public class Ques1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
		        int maxPrice = prices[0];
		        int maxLoss = 0;
		        for (int i = 1; i < prices.length; i++) {
		            if (prices[i] > maxPrice) {
		                maxPrice = prices[i];
		            } else {
		                int loss = maxPrice - prices[i];
		                if (loss > maxLoss){
		                    maxLoss = loss;
		                }
		            }
		        }
		        System.out.println(maxLoss);
	    }
	}