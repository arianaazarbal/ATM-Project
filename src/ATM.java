import java.util.HashMap;

public class ATM {
	
	private String id;
	private int accountBalance;
	
	public ATM (String id, int currBalance)
	{
		this.id= id;
		this.accountBalance = currBalance;
		HashMap <String, Integer> data = AccountDatabase.getData();
		if (!data.containsKey(id))
		{
			data.put (id, ((Integer)currBalance));
		}
	}
	
	public void deposit (int deposit)
	{
		AccountDatabase.getData().replace (id, accountBalance + deposit);
	}
}
