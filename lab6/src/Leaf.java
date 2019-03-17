
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Leaf implements Component {
    protected String description ;
    protected Double price ;
    //private String desc;
    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }

    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }

    public void printDescription(Burger order) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( " " + description + " " + fmt.format(price) ) ;
    }

    public void printdes() {
        System.out.println( " " + description + "\n" ) ;
    }
    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }

    public double getPrice(){
        return 0.0;
    }

}

