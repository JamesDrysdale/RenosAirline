public enum PlaneType {
    //Plane type, capacity, total weight
    CESSNA120(2, 110),
    CESSNA140(2, 120),
    CESSNA140A(4, 150);

    private final int capacity;
    private final int weight;

    //constructor
    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    //method to get the capacity of a plane
    public int getCapacity(){
        return this.capacity;
    }

    //method to get the weight allowance of a plane
    public int getWeight(){
        return this.weight;
    }



}
