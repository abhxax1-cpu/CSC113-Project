public class BasicEconomyTicket extends EconomyTicket {
    private boolean allowedCarryOn;

    public BasicEconomyTicket(String passengerName, String seatNumber, double basePrice, boolean mealIncluded, boolean allowedCarryOn) {
        super(passengerName, seatNumber, basePrice, mealIncluded);
        this.allowedCarryOn = allowedCarryOn;
    }

    public double getBaggageAllowance() {
        return 10.0;
    }

    public boolean isRefundable() {
        return false; // Basic economy tickets are non-refundable
    }
}
