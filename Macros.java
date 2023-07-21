package placements;

public class Macros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    int a = 10, b = 5, c = 15;
		    int temp;
		    if (a > b) {
		        temp = a;
		        a = b;
		        b = temp;
		    }
		    if (b > c) {
		        temp = b;
		        b = c;
		        c = temp;
		    }
		    
		    System.out.println(a + "<" + b + "<" + c);
		}


	}


