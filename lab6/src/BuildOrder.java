
public class BuildOrder
{
    public static Component getOrder()
    {
        Burger burger = new Burger("LBB");
        BunToppings lettuce = new BunToppings("LETTUCE");
        BunToppings tomato = new BunToppings("TOMATO");
        BunToppings gOnion = new BunToppings("->| G ONION");
        BunToppings jalaG = new BunToppings("->| JALA Grilled");
        Bacon bacon = new Bacon("{{{BACON}}}");
        burger.addChild(lettuce);
        burger.addChild(tomato);
        burger.addChild(gOnion);
        burger.addChild(jalaG);
        burger.addChild(bacon);

        Fries fries = new Fries("LTL CAJ", 1, 1);
        burger.addChild(fries);
        ConcreteStrategyCustomerReceipt customerReceipt = new ConcreteStrategyCustomerReceipt();
        customerReceipt.printDescription(burger);
        ConcreteStrategyChefReceipt chefReceipt = new ConcreteStrategyChefReceipt();
        chefReceipt.printdes(burger);
        return burger;

    }
}
