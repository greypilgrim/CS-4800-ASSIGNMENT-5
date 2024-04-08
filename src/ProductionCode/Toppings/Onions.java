package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Onions extends ToppingsDecorator {

    private final double PRICE_OF_ONIONS = 0.10;
    public Onions(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_ONIONS;
    }
}
