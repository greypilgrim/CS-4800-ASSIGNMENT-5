package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Chili extends ToppingsDecorator {

    private final double PRICE_OF_CHILI = 0.75;
    public Chili(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_CHILI;
    }
}
