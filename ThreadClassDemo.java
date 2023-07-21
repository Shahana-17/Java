package pc;
import java.util.*;
public class ThreadClassDemo {

	{

		public static void main(String[] args)
		{
		int[] numarr = new int[6];
		for(int i=0; i<5; i++)
		{
		numarr[i] = Integer.parseInt(args[i]);
		}
		Runnable hello = new AverageNumber(numarr);
		Thread thread1 = new Thread(hello);
		thread1.setDaemon(true);
		thread1.setName("AvgNum");
		System.out.println(thread1.getName() + " is starting...");
		thread1.start();

		Runnable bye = new MaximumNumber(numarr);
		Thread thread2 = new Thread(bye);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.setDaemon(true);
		thread2.setName("MaxNum");
		System.out.println(thread2.getName() + " is starting...");
		thread2.start();

		Runnable min = new MinimumNumber(numarr);
		Thread thread3 = new Thread(min);
		thread3.setPriority(Thread.MIN_PRIORITY);
		thread3.setDaemon(true);
		thread3.setName("MinNum");
		System.out.println(thread3.getName() + " is starting...");
		thread3.start(); 
		}
		}
}