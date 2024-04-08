package ProductionCode;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<FoodOptions> items = new ArrayList<>();

    public void addItem(FoodOptions item) {
        items.add(item);
    }
    public double calculateTotal() {
        return items.stream().mapToDouble(FoodOptions::getCost).sum();
    }
}
