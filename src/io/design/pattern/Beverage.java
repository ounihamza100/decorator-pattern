package io.design.pattern;

/**
 * @author Hamza Ouni
 */
public abstract class Beverage {

    String description;
    public abstract  double cost();

    public String getDescription() {
        return description;
    }
}
