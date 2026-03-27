public class FirstClassTicket extends Ticket {
    private boolean includesSpaAccess;

    public FirstClassTicket(String passengerName, String seatNumber, double basePrice, boolean includesSpaAccess) {
        super(passengerName, seatNumber, basePrice);
        this.includesSpaAccess = includesSpaAccess;
    }

    public double getBaggageAllowance() {
        return 50.0;
    }

    public double calculateRefundAmount() {
        if (isRefundable()) {
            return basePrice * 0.8; // 80% refund for first class tickets
        }
        return 0.0;
    }

    public boolean isRefundable() {
        return true;
    }
}
