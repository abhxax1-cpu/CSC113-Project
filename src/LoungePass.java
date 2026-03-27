public class LoungePass implements Refundable {
    private String passId;
    private String holderName;
    private int accessLevel; // e.g., 1 for basic, 2 for premium
    private double price;

    public LoungePass(String holderName, int accessLevel, double price) {
        this.passId = "LP" + System.currentTimeMillis(); // Generate a unique pass ID
        this.holderName = holderName;
        this.accessLevel = accessLevel;
        this.price = price;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public double calculateRefundAmount() {
        return price * 0.5; // 50% refund for lounge passes
    }

    public boolean isRefundable() {
        return true;
    }

}
