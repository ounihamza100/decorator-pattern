package io.design.pattern;

/**
 * @author Hamza Ouni
 */
public class StarbuzzCoffee {
    public static void main(String args[]) {

        Beverage tea = new Tea();
        Beverage espresso = new Espresso();



        tea = new Mint(tea);
        tea = new Pine(tea);

        System.out.println(tea.cost());

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mint(beverage2);
        beverage2 = new Mint(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Milk(beverage3);
        beverage3 = new Mint(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

    }
}
