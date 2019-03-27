import java.text.DecimalFormat;

public class CustomerReceipt implements Strategy
{
    private double total;
    public CustomerReceipt()
    {
     
    }

    public void printDescription(Burger order){
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Customer Receipt\n\n");
        System.out.println("Five Guys\n\n");
        System.out.println("Order\n");
        order.printDescription(order);
        total = order.total();
        System.out.println("  Sub. Total:\t\t" + fmt.format(total));
        System.out.println("*******End of Customer Receipt *******\n\n");
    }
    public void printdes(Burger order)
    { //Do nothing 
    }
}
