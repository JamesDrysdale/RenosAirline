public class Passenger {
    public String name;
    public int bagCount;

    //constructor
    public Passenger(String name, int bagCount){
        this.name = name;
        this.bagCount = bagCount; // see comment
    }

    /*  bagCount
        I thought about using a class for bag, so you could make multiple
        instances of bag. But since they all weigh the same, it didn't
        seem necessary. The code could be refactored in the future if needed.

        I am assuming each bag weighs 50 each
     */

}
