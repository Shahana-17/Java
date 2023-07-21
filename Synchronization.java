package placements;
import java.util.*;
import java.lang.*;
public class Synchronization
{
	synchronized void printtable(int n)
	{
	for(int i=1;i<=5;i++)
	{
	System.out.print(n*i);
	try{
	Thread.sleep(400);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
	}
	}
	class mythread extends Thread{
	Synchronization t;
	mythread(Synchronization t)
	{
	this.t=t;
	}
	public void run()
	{
	t.printtable(100);
	}
	class synchronization{
	public static void main(String args[])
	{
	Synchronization obj=new Synchronization();
	mythread t1=new mythread(obj);
	mythread t2=new mythread(obj);
	t1.start();
	t2.start();

	}
}}
