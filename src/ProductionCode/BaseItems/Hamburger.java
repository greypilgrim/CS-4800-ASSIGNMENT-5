package ProductionCode.BaseItems;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Hamburger extends ToppingsDecorator {

    public Hamburger(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
}
