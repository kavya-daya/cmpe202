

public class BunToppings extends Leaf
{
    private String[] options ;
    
    public BunToppings(String description) {
        super(description);
    }

    public void printDescription(){
            System.out.println(" "+description);
    }
    
    public double getPrice(){
        return 0.0;
    }
    
}