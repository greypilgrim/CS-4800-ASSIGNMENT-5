package ProductionCode;

public class Loyalty {
    public double applyDiscount(double total, String status) {
        if ("GOLD".equals(status)) {
            return total * 0.8;
        }
        if ("SILVER".equals(status)) {
            return total * 0.9;
        }
        if ("BRONZE".equals(status)) {
            return total * 0.95;
        }

        return total;
    }
}
