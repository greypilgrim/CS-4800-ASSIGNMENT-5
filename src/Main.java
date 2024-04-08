import ProductionCode.BaseFoodOption;
import ProductionCode.CustomerOrder;
import ProductionCode.FoodOptions;
import ProductionCode.Loyalty;
import ProductionCode.Toppings.*;

public class Main {
    public static void main(String[] args) {

        double orderTotal;

        CustomerOrder order_1 = new CustomerOrder();
        Loyalty customerLoyalty = new Loyalty();

        FoodOptions hamburger = new BaseFoodOption("Hamburger", 5.75);
        FoodOptions hotdog = new BaseFoodOption("Hotdog", 3.50);
        FoodOptions frenchFries = new BaseFoodOption("French Fries", 2.00);

        hamburger = new Cheese(hamburger);
        hamburger = new Lettuce(hamburger);
        hamburger = new Tomato(hamburger);

        hotdog = new Chili(hotdog);
        hotdog = new Cheese(hotdog);

        frenchFries = new Onions(frenchFries);
        frenchFries = new Relish(frenchFries);
        frenchFries = new Jalapeno(frenchFries);

        order_1.addItem(hamburger);
        order_1.addItem(hotdog);
        order_1.addItem(frenchFries);

        orderTotal = order_1.calculateTotal();
        orderTotal = customerLoyalty.applyDiscount(orderTotal, "SILVER");

        System.out.println("The total cost of your order will be: $" + orderTotal);
    }
}