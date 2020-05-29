public class Flight {

    private String flightName;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(String flightName, String destination, String departure, String departureName){
        this.flightName = flightName;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departure;
    }

    public String getFlightName(){
        return this.flightName;
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
}
