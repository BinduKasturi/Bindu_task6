import java.util.*;
import java.io.*;
//Student names can be added,removed and printed in this application
public class CustomCollectionsTask
{
	static ArrayList<String> l=new ArrayList<String>();
	static void print()
	{
		int n=l.size();
		for (int i=0;i<n;i++)
		{
			System.out.println(l.get(i));
		}
	}
	static void fetch(int x)
	{
		System.out.println("name is:"+l.get(x));
	}
	static void add(String name)
	{
		l.add(name);
		System.out.println("successfully added");
	}
	static void remove(int n)
	{
		String s=l.get(n);
		l.remove(n);
		System.out.println("successfully removed**    "+s);
	}
	public static void main(String[] z)
	{
		Scanner w=new Scanner(System.in);
		l.add("Bindu");
		l.add("Pooja");
		l.add("pavani");
		l.add("hithaishi");
		l.add("hari");
		l.add("nethaji");
		l.add("harsha");
		l.add("pavan");
		l.add("satish");
		l.add("Tejesh");
		System.out.println("List in the begining");
		print();
		while(true)
		{
			System.out.print("1.print\t2.fetch\t3.remove\t4.add\t5.exit\nEnter your choice(1/2/3/4/5):");
			int n=w.nextInt();
			if(n==1)
			{
				print();
			}
			else if(n==2)
			{
				System.out.print("enter index of name to be fetched:");
				int x=w.nextInt();
				fetch(x);
			}
			else if(n==3)
			{
				System.out.print("enter index of name to be removed:");
				int x=w.nextInt();
				remove(x);
			}
			else if(n==4)
			{
				System.out.print("enter index of name to be added:");
				String x=w.next();
				add(x);
			}
			else
			{
				break;
			}
		}
		System.out.println("Successfully exited");
	}
}


