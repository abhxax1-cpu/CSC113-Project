public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String status;
    private Ticket[] tickets;
    private int numOfTickets;

    public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = "Scheduled";
        this.tickets = new Ticket[100]; // Assuming a maximum of 100 tickets per flight
        this.numOfTickets = 0;
    }

    // public boolean addTicket(Ticket t) {

    // }

    // public boolean removeTicket(String id) {

    // }

    // public Ticket searchTicket(String id) {

    // }

    // public String toString() {

    // }
}