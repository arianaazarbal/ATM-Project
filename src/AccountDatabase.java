//import java.util.HashMap;
//
//public class AccountDatabase {
//	private static HashMap <String, Double> accountDatabase = new HashMap <String, Double> ();
//	
//
//	public static void addAccount (String id, Double accountBalance)
//	{
//		accountDatabase.put (id, accountBalance);
//	}
//	
//	public static void changeBalance (String id, Double newBalance)
//	{
//		accountDatabase.replace (id, newBalance);
//	}
//	
//	public static HashMap <String, Double> getData ()
//	{
//		return accountDatabase;
//	}
//	
//	public static String getBalance(String id)
//	{
//		String theBalance;
//		theBalance = "" + accountDatabase.get(id);
//		return theBalance;
//	}
//
//}
