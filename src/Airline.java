public class Airline {
    private String name;
    private Flight[] flights;
    private int numOfFlights;

    public Airline(String name, int maxFlights) {
        this.name = name;
        this.flights = new Flight[maxFlights];
        this.numOfFlights = 0;
    }

    // public boolean addFlight(Flight f) {

    // }

    // public String toString() {

    // }
}
