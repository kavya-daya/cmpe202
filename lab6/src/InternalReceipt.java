import java.text.DecimalFormat;

public class ConcreteStrategyChefReceipt implements Strategy
{
      
    public ConcreteStrategyChefReceipt()
    {
        
    }

    public void printDescription(Burger order){
         // Do nothing
    }
    public void printdes(Burger order){
        System.out.println("*****Internal Receipt -- Chef *****\n\n");
        System.out.println("Five guys\n\n");
        System.out.println("Order\n\n");
        order.printdes();
        System.out.println("*****End of Internal Receipt -- Chef *****\n\n");
    }
}
