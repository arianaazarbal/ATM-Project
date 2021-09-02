
public class ATMTester {
	public static void main (String [] args)
	{
		ATM theATM = new ATM();

		theATM.deposit("Winfrey", 25159684372.43);
		theATM.deposit("Bezos", 193495330293.43);
		theATM.deposit("Bezos", 20394353.35);
		theATM.withdraw("Bezos", 3593293.66);
		theATM.deposit("MrTheiss",64033.55);
		theATM.withdraw("MrTheiss", 443964.46);
		System.out.println(theATM.checkBalance("Bezos"));
		System.out.println(theATM.checkBalance("Winfrey"));
		System.out.println(theATM.checkBalance("YoMama"));
		System.out.println(theATM.checkBalance("MrTheiss"));
	}

}
