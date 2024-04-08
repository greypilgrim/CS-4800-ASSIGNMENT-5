package ProductionCode;

public class BaseFoodOption implements FoodOptions{

    private String foodName;
    private double cost;
    public BaseFoodOption(String description, double cost) {
        this.foodName = description;
        this.cost = cost;
    }
    @Override
    public String getFoodName() {
        return this.foodName;
    }
    @Override
    public double getCost() {
        return this.cost;
    }
}
