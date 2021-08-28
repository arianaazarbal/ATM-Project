import java.util.HashMap;

public class AccountDatabase {
	private static HashMap <String, Integer> accountDatabase; 
	
	public AccountDatabase ()
	{
		accountDatabase= new HashMap <String, Integer> ();

	}
	public void addAccount (String id, int accountBalance)
	{
		accountDatabase.put (id, accountBalance);
	}
	
	public static HashMap <String, Integer> getData ()
	{
		return accountDatabase;
	}

}
