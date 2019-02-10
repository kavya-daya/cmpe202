

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {

		System.out.println("You inserted a Coin");
		if(coin == 25)
		{
			if(gumballMachine.machine == 1) //MACHINE_Quarter =1
				gumballMachine.setState(gumballMachine.getHasRequiredCoinState());
			else
			{
				gumballMachine.value += coin;			
				gumballMachine.setState(gumballMachine.getHasCoinState());
			}
		}
		else if(gumballMachine.machine!= 3) //MACHINE_AllCoin = 3
			ejectCoin();
		else
		{
			gumballMachine.value += coin;
			//System.out.println("Coin value : " +gumballMachine.value);
			gumballMachine.setState(gumballMachine.getHasCoinState());
		}
			
		
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted right Coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no Coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for Coin";
	}
}
