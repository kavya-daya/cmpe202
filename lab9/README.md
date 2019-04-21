## Strategy Design pattern

- Without lambda (original implementation of Strategy pattern)

The original implementation of strategy pattern includes one interface Istrategy which has the method calculateTax(). There are three different strategies for calculating the Income tax : PersonalTax, PersonalTaxWithPenalty and PersonalTaxWithRebate. There is another client class TaxStrategyMain where all the three strategy classes are instantiated and their calculateTax() method is called one by one.

- With lambda (functional programming)

In the lambda way of implementation of Stategy pattern, there is no need to create three separate Java classes for three different strategies. Instead, using lambda function, different implementations of the strategies are made in the client class itself. Thus the new code now has only one interface IStrategy and one Java class TaxStrategyMain where lambda function is used for implementation of three different kinds of strategies.

- **Comparison**

Using lambda function for this design pattern, the code becomes quite concise. Thus, the code can be refactored to remove the boilerplate and the implementation becomes less verbose.
