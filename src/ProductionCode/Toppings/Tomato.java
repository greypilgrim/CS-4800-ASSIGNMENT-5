package ProductionCode.Toppings;

import ProductionCode.FoodOptions;
import ProductionCode.ToppingsDecorator;

public class Tomato extends ToppingsDecorator {

    private final double PRICE_OF_TOMATO = 0.30;
    public Tomato(FoodOptions newFoodItem) {
        super(newFoodItem);
    }
    @Override
    public double getCost() {
        return tempFoodItem.getCost() + PRICE_OF_TOMATO;
    }
}
