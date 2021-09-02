import java.util.*;


public class ATM {
	HashMap<String, Double> bankBalances = new HashMap<String,Double>();

	public void deposit (String theID, double amount)
	{
		if (amount<0) {
			System.out.println("Error. You must deposit a positive value.");
		}
		else if (!(bankBalances.containsKey(theID)))
		{
			bankBalances.put(theID, amount);
			System.out.println("You succesfully created an account and deposited the money.");
		}
		else
		{
			bankBalances.replace(theID, bankBalances.get(theID)+amount);
			System.out.println("You succesfully deposited the money.");
		}
	}
	public void withdraw (String theID, double withdraw)
	{
		if (!(bankBalances.containsKey(theID)))
		{
			System.out.println("Error. The account doesn't exist.");
		}
		else if (withdraw<0)
		{
			System.out.println("Error. You must withdraw a positive amount.");
		}
		else
		{
			if (withdraw>bankBalances.get(theID))
			{
				System.out.println("Error. You can't withdraw that much money.");
			}
			else
			{
				bankBalances.replace(theID, bankBalances.get(theID)-withdraw);
				System.out.println("You succesfully withdrew the money.");
			}
		}
	}
	public String checkBalance (String theID)
	{
		if (!(bankBalances.containsKey(theID)))
		{
			return ("Error. The account doesn't exist.");
		}
		String theBalance;
		theBalance = "" + bankBalances.get(theID);
		return theBalance;
	}
}
