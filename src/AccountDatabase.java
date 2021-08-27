import java.util.HashMap;

public class AccountDatabase {
	private HashMap <String, Integer> accountDatabase; 
	
	public AccountDatabase ()
	{
		accountDatabase= new HashMap <String, Integer> ();

	}
	public void addAccount (String id, int accountBalance)
	{
		accountDatabase.put (id, accountBalance);
	}

}
