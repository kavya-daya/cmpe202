
public class HasCoinState implements State{

	GumballMachine gumballMachine;

	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertCoin(int coin) {
		
		System.out.println("You inserted a coin  ");
		//Kavya :Check this
		//Gumball machine MACHINE_Quarter will never encounter this condition(?). It probably goes to HasRequiredCoin state
		if(coin == 25)
		{
			if((gumballMachine.value+ coin) >= 50)
				gumballMachine.setState(gumballMachine.getHasRequiredCoinState());
			else 
				gumballMachine.value +=coin;
				
		}
		else if(gumballMachine.machine!= 3) //MACHINE_AllCoin =3
			System.out.println("Coin returned");
		else
		{
			if((gumballMachine.value+ coin) >= 50)
				gumballMachine.setState(gumballMachine.getHasRequiredCoinState());
			else 
				gumballMachine.value +=coin;
			
			
		}
	}
	
	public void ejectCoin() {
		System.out.println("Coin returned");
	}

	public void turnCrank() {
		System.out.println("You turned, but you need to pay more");
	}

	public void dispense() {
		System.out.println("You need to pay more");
	}

	public String toString() {
		return "waiting for more coins";
	}
	
}
