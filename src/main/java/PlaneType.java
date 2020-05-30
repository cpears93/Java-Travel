public enum PlaneType {
    CAPACITY(300),
    TOTALWEIGHT(5000);

    private final int value;

    PlaneType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
