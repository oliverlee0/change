import java.util.Scanner;
public class Change
{
	public static final Scanner console = new Scanner(System.in);	
	public static void main(String[] args)
	{
		int change = console.nextInt();
		System.out.println(waysToMakeChange(change));
	}
	/*
		cents -- the amount
		@return -- number of ways you can make change with the amount
	*/
	public static int waysToMakeChange(int cents)
	{
		if (cents == 0)	{return 1;}
		int numOfWays = 0;
		// if the sum of a unique combination of pennies, nickels, dimes, and quarters equals the given cents, then it's a new way
		for (int pennies = 0; pennies <= cents; pennies++)
		{
			for (int nickels = 0; nickels <= cents; nickels += 5)
			{
				for (int dimes = 0; dimes <= cents; dimes += 10)
				{
					for (int quarters = 0; quarters <= cents; quarters += 25)
					{
						if (pennies + nickels + dimes + quarters == cents)
						{
							numOfWays++;
						}
					}
				}
			}
		}
		return numOfWays;
	}
}