import java.util.HashMap;

public class AccountDatabase {
	private static HashMap <String, Integer> accountDatabase = new HashMap <String, Integer> ();
	

	public static void addAccount (String id, int accountBalance)
	{
		accountDatabase.put (id, accountBalance);
	}
	
	public static void changeBalance (String id, int newBalance)
	{
		accountDatabase.replace (id, newBalance);
	}
	
	public static HashMap <String, Integer> getData ()
	{
		return accountDatabase;
	}

}
