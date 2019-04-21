
public class BuildOrder
{
    public static Component getOrder()
    {
        Burger burger = new Burger("LBB");
        BunToppings lettuce = new BunToppings("LETTUCE");
        BunToppings tomato = new BunToppings("TOMATO");
        BunToppings gOnion = new BunToppings("->| G ONION");
        BunToppings jalaG = new BunToppings("->| JALA Grilled");
        Meat bacon = new Meat("{{{BACON}}}");
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jalaG);
        burger.addChild(bacon);

        Fries fries = new Fries("LTL CAJ");
        burger.addChild(fries);
        CustomerReceipt customerReceipt = new ConcreteStrategyCustomerReceipt();
        customerReceipt.printDescription(burger);
        InternalReceipt chefReceipt = new ConcreteStrategyChefReceipt();
        chefReceipt.printdes(burger);
        return burger;

    }
}
