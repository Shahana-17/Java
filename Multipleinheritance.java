package placements;
interface one{
     void print_greeks();
}
interface two{
	 void print_for();
}
interface three extends one,two{
	 void print_greeks();
}
class child implements three{
	 public void print_greeks() {
		System.out.print("Greeks ");
	}
	public void print_for() {
		System.out.print("for ");
	}
}
public class Multipleinheritance {
	public static void main(String[] args) {
		child c=new child();
		c.print_greeks();
		c.print_for();
		c.print_greeks();
	}
}
