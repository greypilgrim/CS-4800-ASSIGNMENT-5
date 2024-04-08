package ProductionCode;
import ProductionCode.BaseItems.*;
import ProductionCode.Toppings.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTests {
    @Test
    public void testSimpleFoodItemCost() {
        FoodOptions burger = new BaseFoodOption("Burger", 5.00);
        assertEquals(5.00, burger.getCost(), "Burger cost should be 5.00");
    }

    @Test
    public void testBurgerWithToppingsCost() {
        FoodOptions burger = new BaseFoodOption("Burger", 5.00);
        burger = new Cheese(burger);
        burger = new Tomato(burger);
        burger = new Lettuce(burger);
        burger = new Onions(burger);
        assertEquals(6.25, burger.getCost(), "Burger with toppings cost should be 6.25");
    }

    @Test
    public void testOrderTotalCost() {
        FoodOptions burger = new BaseFoodOption("Burger", 5.00);
        burger = new Cheese(burger);
        burger = new Tomato(burger);
        burger = new Lettuce(burger);
        burger = new Onions(burger);

        FoodOptions hotDog = new BaseFoodOption("Hot Dog", 3.00);
        hotDog = new Onions(hotDog);

        CustomerOrder order = new CustomerOrder();
        order.addItem(burger);
        order.addItem(hotDog);

        assertEquals(9.45, order.calculateTotal(), "Order total cost should be 9.45");
    }

    @Test
    public void testLoyaltyDiscount() {
        CustomerOrder order = new CustomerOrder();
        order.addItem(new BaseFoodOption("Burger", 5.00));
        order.addItem(new BaseFoodOption("Hot Dog", 3.00));

        double total = order.calculateTotal();
        Loyalty discount = new Loyalty();
        total = discount.applyDiscount(total, "GOLD");

        assertEquals(7.20, total, "Total cost after GOLD discount should be 7.20");
    }
}
