package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Lettuce extends ToppingsDecorator {

    private final double PRICE_OF_LETTUCE = 0.05;
    public Lettuce(FoodOptions newFoodItem) {
        super(newFoodItem);
    }

    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_LETTUCE;
    }
}
