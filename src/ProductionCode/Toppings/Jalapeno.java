package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Jalapeno extends ToppingsDecorator {

    private final double PRICE_OF_JALAPENO = 0.15;
    public Jalapeno(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_JALAPENO;
    }
}
