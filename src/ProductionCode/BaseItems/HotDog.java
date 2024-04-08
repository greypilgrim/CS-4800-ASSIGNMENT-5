package ProductionCode.BaseItems;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class HotDog extends ToppingsDecorator {
    public HotDog(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
}
