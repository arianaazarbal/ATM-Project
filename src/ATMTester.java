
public class ATMTester {
	public static void main (String [] args)
	{
		ATM atm1 = new ATM ("abcdefg", 300);
		atm1.deposit(60);
		
		System.out.println (atm1.getNewBalance());
		
		ATM atm2 = new ATM ("abcdefg", 360);
		atm2.deposit (60);
		System.out.println (atm2.getNewBalance());
	}

}
