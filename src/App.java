
public class App {

	public static void main(String[] args) {
		//initialize independent variables
		boolean isHotOutside = true, isWeekDay = false;
		
		double costOfMilk = 2.98, moneyInWallet = 10.00;
		
		int thirstLevel = 4;
		
		//initialize dependent boolean variables
		boolean hasMoneyInPocket = moneyInWallet > 0;
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		boolean willGoSwimming = (isHotOutside && !isWeekDay);
		boolean isAGoodDay = isHotOutside && (hasMoneyInPocket && !isWeekDay);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3 && (moneyInWallet > 2*costOfMilk));
		
		
		//Print out all variables
		System.out.println("isHotOutside: " +isHotOutside);
		System.out.println("isWeekDay: " + isWeekDay);
		System.out.println("Money in Wallet: " +moneyInWallet);
		System.out.println("hasMoneyInPocket: " +hasMoneyInPocket);
		System.out.println("Cost of milk: " +costOfMilk);
		System.out.println("thirstLevel: " +thirstLevel);
		System.out.println("Should buy ice cream: " +shouldBuyIceCream);
		System.out.println("Will go swimming: " +willGoSwimming);
		System.out.println("Today is a good day: " +isAGoodDay);
		System.out.println("Will buy milk: " +willBuyMilk);
		
		
		
	}

}
