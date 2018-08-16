/**
 * Created by mhz on 22/12/17.
 */
public class Flight {

    private String name;
    private int departure;
    private int duration;
    private int price;

    public Flight (){

    }

    public Flight(String name, int departure, int duration, int price) {
        this.name = name;
        this.departure = departure;
        this.duration = duration;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeparture() {
        return departure;
    }

    public void setDeparture(int departure) {
        this.departure = departure;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
