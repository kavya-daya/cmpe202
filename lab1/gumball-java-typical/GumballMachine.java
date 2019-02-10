import java.io.*; 

public class GumballMachine
{

    protected int num_gumballs;
    //private boolean has_quarter;
   // private int coin;
    protected int value;
    protected int min_value;

    public GumballMachine( int size)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.value = 0 ;//coin_value;
        this.min_value = 50; 
        //this.has_quarter = false;
    }

    public void insertCoin(int coin)
    {
    	System.out.println( " \nCoin inserted ");
    	if(this.value == 0)
    		this.value = coin;
    	else
    		this.value += coin;
    }
    
    public void turnCrank()
    {
    	if (this.value >= this.min_value  )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "\nThanks for your money.  Gumball Ejected!" ) ;
    			if (this.value > this.min_value)
    				System.out.println( "\nPlease collect your change : " +(this.value-this.min_value) ) ;
				this.value = 0;	
    		}
    		else
    		{
    			System.out.println( "\nNo More Gumballs!  Sorry, can't return your money." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "\nYou inserted " +this.value + "  Please insert at least " +this.min_value) ;
    	}        
    }
}


class GumballMachine_quarter extends GumballMachine
{
    public GumballMachine_quarter( int size)
    {
        // initialise instance variables
        super(size);
        this.value = 0;
        this.min_value = 25; 
        //this.has_quarter = false;
    }
    
    public void insertCoin(int coin)
    {
    	System.out.println( "\n Coin inserted : " +coin);
    	if(coin == 25)
    		this.value += coin;
    	else
    	{
    		System.out.println( "\nOnly a quarter is accepted. Please collect your change : " +(coin) ) ;
			this.value = 0;	
		}
    }
}


class GumballMachine_50cents extends GumballMachine_quarter
{
    public GumballMachine_50cents( int size)
    {
        // initialise instance variables
        super(size);
        this.value = 0;
        this.min_value = 50; 
        //this.has_quarter = false;
    }
    
}