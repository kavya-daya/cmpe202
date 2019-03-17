
import java.text.DecimalFormat;
public class Fries extends Leaf
{
    private double price = 2.79;
   
    public Fries(String description)
    {
        super(description);
    }

    private void setPrice(){
       
    }

    public void printDescription() {
     //   DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("\n "+ description + " " + "2.79");

    }
    public void printdes() {
        System.out.println(description + "\n");

    }
    public double getPrice(){
        return this.price;
        
    }

}