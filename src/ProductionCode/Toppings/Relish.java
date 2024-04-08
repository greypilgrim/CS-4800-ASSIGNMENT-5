package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Relish extends ToppingsDecorator {

    private final double PRICE_OF_RELISH = 0.05;
    public Relish(FoodOptions newFoodItem) {
        super(newFoodItem);
    }

    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_RELISH;
    }
}
