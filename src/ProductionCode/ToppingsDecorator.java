package ProductionCode;

public abstract class ToppingsDecorator implements FoodOptions{
    protected FoodOptions tempFoodItem;

    public ToppingsDecorator(FoodOptions newFoodItem) {
        this.tempFoodItem = newFoodItem;
    }

    @Override
    public String getFoodName() {
        return this.tempFoodItem.getFoodName();
    }

    @Override
    public double getCost() {
        return this.tempFoodItem.getCost();
    }
}
