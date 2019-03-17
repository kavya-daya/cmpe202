
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Burger extends Composite
{
    private double price;
    public double total_amt=0.0;
    public ArrayList<Component> component_sub = new ArrayList<Component>()  ;
    public String description = "";

    public Burger ( String d)
    {
        super(d) ;
        //this.quantity = quantity;
        description = d;
        setPrice();
    }

    public void setPrice(){
       if(description == "HamB")
          this.price = 6.39;
       else if (description == "ChB")
          this.price = 7.19;
       else if(description == "BacB")
          this.price = 7.19;
       else if(description == "BaChB")
          this.price = 7.79;
       else if(description == "LHamB")
          this.price = 4.59;
       else if(description == "LChB")
          this.price = 5.29;
       else if(description == "LBB")
          this.price = 5.59;
       else if(description == "LBaChB")
          this.price = 6.19;
       else 
          this.price = 0.0;
          return;
          
    }

    public void printDescription(Burger order) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( "\n " + " " + description + " " + fmt.format(getPrice()) + "\n");
    
        for (Component obj  : components)
          {
           if(obj.getClass().getName().equalsIgnoreCase("Bacon"))
                 obj.printDescription(order);
          }

         for (Component obj  : components)
          {
               if(!obj.getClass().getName().equalsIgnoreCase("Bacon"))
                   obj.printDescription(order);
          }
            
//        for (Component obj  : components)
//            {
//                    obj.printDescription(order);
//            }
    }
    public void printdes() {
        //  DecimalFormat fmt = new DecimalFormat("0.00");
         System.out.println( "\n " + " " + description + " " + "\n");
         for (Component obj  : components)
            {
                    obj.printdes();
            }
    
    }

    public double getPrice() {
        return this.price;

    }

    public double total(){
        for (Component obj  : components)
        {
            total_amt= this.getPrice()+obj.getPrice();
        }
        return total_amt;
    }

}
