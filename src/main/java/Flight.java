public class Flight {

    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;
    private int availableSeats;

    public Flight(String flightNumber, String destination, String departure, String departureName, int availableSeats){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departure;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDeparture(){
        return this.departure;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }
}
