package io.design.pattern;

/**
 * @author Hamza Ouni
 */
public class Pine extends CondimentDecorator {
    Beverage beverage;
    public Pine(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Pine";
    }
    public double cost() {
        return 3 + beverage.cost();
    }

}
