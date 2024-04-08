package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Cheese extends ToppingsDecorator {

    private final double PRICE_OF_CHEESE = 0.30;
    public Cheese(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_CHEESE;
    }
}
