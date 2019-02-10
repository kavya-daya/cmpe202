

public class Main  {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);
		System.out.println("\n");
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		//System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 15 );
		gumballMachine.turnCrank();
		
		
		GumballMachine gumballMachine_quarter = new GumballMachine_quarter(5);
		System.out.println("\n");
		System.out.println(gumballMachine_quarter);
		System.out.println("\n");
			
        gumballMachine_quarter.insertCoin( 10 );
        gumballMachine_quarter.insertCoin( 25 );
        gumballMachine_quarter.turnCrank();
        
        
        GumballMachine gumballMachine_50cents = new GumballMachine_50cents(5);
        System.out.println("\n");
        System.out.println(gumballMachine_50cents);
        System.out.println("\n");
  
        gumballMachine_50cents.insertCoin( 25 );
        gumballMachine_50cents.insertCoin( 25 );
        gumballMachine_50cents.insertCoin( 25 );
        gumballMachine_50cents.turnCrank();
	}
}
