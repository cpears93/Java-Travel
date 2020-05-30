public class Plane {

    private PlaneType capacity;
    private PlaneType totalWeight;

    public Plane(PlaneType capacity, PlaneType totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getCapacity(){
        return this.capacity;
    }

    public PlaneType getTotalWeight(){
        return this.totalWeight;
    }

    public int getValueFromEnum(){
        return this.capacity.getValue();
    }
}
