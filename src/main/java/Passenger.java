public class Passenger {

    private String name;
    private int numberofBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberofBags = numberOfBags;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberofBags(){
        return this.numberofBags;
    }
}
