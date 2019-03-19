package cse360assign3;
import java.util.*;


//THIS IS THE MAIN I WROTE TO TEST	
public class maintest{
	public static void main(String[] args)
	{
		OrderedIntList testClass = new OrderedIntList();
		Scanner scan = new Scanner(System.in);
		int c = 0;
		while(scan.hasNext())
		{
		int var = scan.nextInt();
		testClass.insert(var);
		System.out.println(testClass.toString());
		

		c++;
		if (c%5 == 0) {
			int key = scan.nextInt();

			testClass.delete(key);
		}
		}
	}

}

