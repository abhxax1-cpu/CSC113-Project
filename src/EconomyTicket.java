public class EconomyTicket extends Ticket {
    protected boolean mealIncluded;

    public EconomyTicket(String passengerName, String seatNumber, double basePrice, boolean mealIncluded) {
        super(passengerName, seatNumber, basePrice);
        this.mealIncluded = mealIncluded;
    }

    public double getBaggageAllowance() {
        return 20.0;
    }

    public double calculateRefundAmount() {
        if (isRefundable()) {
            return basePrice * 0.5; // 50% refund for economy tickets
        }
        return 0.0;
    }

    public boolean isRefundable() {
        return true;
    }
}
