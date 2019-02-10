

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,1); // only quarters

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		GumballMachine gumballMachine_50cents = new GumballMachine(5,2); // two quarters

		System.out.println(gumballMachine_50cents);

		gumballMachine_50cents.insertCoin(25);
		gumballMachine_50cents.turnCrank();

		System.out.println(gumballMachine_50cents);

		gumballMachine_50cents.insertCoin(25);
		gumballMachine_50cents.turnCrank();
		gumballMachine_50cents.insertCoin(25);
		gumballMachine_50cents.turnCrank();

		System.out.println(gumballMachine_50cents);
		
		GumballMachine gumballMachine_Allcoin = new GumballMachine(5,3); // ALL coins

		System.out.println(gumballMachine_Allcoin);

		gumballMachine_Allcoin.insertCoin(10);
		gumballMachine_Allcoin.turnCrank();

		System.out.println(gumballMachine_Allcoin);

		gumballMachine_Allcoin.insertCoin(25);
		gumballMachine_Allcoin.turnCrank();
		gumballMachine_Allcoin.insertCoin(25);
		gumballMachine_Allcoin.insertCoin(25);
		gumballMachine_Allcoin.turnCrank();

		System.out.println(gumballMachine_Allcoin);
	}
}
