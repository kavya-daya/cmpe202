
import java.util.ArrayList;

public class Composite implements Component {

    public ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;

    public Composite ( String d )
    {
        description = d ;
    }

    public void printDescription(Burger order) {
      //  System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription(order);
        }
    }
    public void printdes() {
      //  System.out.println( description );
        for (Component obj  : components)
        {
            obj.printdes();
        }
    }
    public void addChild(Component c) {
        components.add( c ) ;
    }

    public void removeChild(Component c) {
        components.remove(c) ;
    }

    public Component getChild(int i) {
        return components.get( i ) ;
    }

    public void setPrice(){
        //return;
    }

    public double getPrice(){
        return 0.0;
    }

    public double total(){
        return 0.0;
    }
}
 