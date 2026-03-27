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
    public boolean addTicket(Ticket t) {
    if(numOfTickets==tickets.lenght||searchTicket(t)!=-1)
    return false;
    tickets[numOfTickets++]=t;
    return true;
    }
    // } 

    // public boolean removeTicket(String id) {
    public boolean removeTicket(Ticket t){
    int removedTicket = searchTicket(t);
    if(searchTicket(t)==-1)
        return false;
    tickets[removedTicket]=tickets[numOfTickets-1];
    tickets[numOfTickets-1]=null;
    numOfTickets--;
    return true;
    }
    // }

    // public Ticket searchTicket(String id) {
public int searchTicket(Ticket id){
    for (int i=0;i<numOfTickets;i++)
        if(tickets[i].getTicketId().equals(id.getTicketId()))
            return i;
    return -1;
}
    // }

    // public String toString() {
public String toString(){
    String str = "flightNumber :" + flightNumber + " origin :" + origin + " destination :" + destination + " departureTime :" + departureTime + " arrivalTime :" + arrivalTime + " status:";
    for (int i=0;i<numOfTickets;i++){
        str+= (i+1)+ tickets[i].toString +"\n";
    }
    return str;
}
    // }
}
