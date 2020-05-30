import java.util.ArrayList;

public class Flight<integer> {

    private final int bookedPassengers;
    public int BookedPassengers;
    private ArrayList<Integer> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int availableSeats;

    public Flight(int bookedPassengers, String flightNumber, String destination, String departureAirport, String departureTime, int availableSeats){
        this.bookedPassengers = bookedPassengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public int getBookedPassengers(){ return this.passengers.size(); }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureAirport(){
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }

    public boolean addPassengers(int passengers) { return this.passengers.add(passengers); }

    public void addPassenger(int i) {
    }

    public int addBookedPassengers(){
        return this.BookedPassengers();
    }

    private int BookedPassengers() {
        return 1;
    }
}
