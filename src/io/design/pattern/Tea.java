package io.design.pattern;

/**
 * @author Hamza Ouni
 */
public class Tea extends Beverage {

    public Tea() {
        description = "Tea";
    }

    @Override
    public double cost() {
        return 2;
    }
}
