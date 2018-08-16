import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by mhz on 22/12/17.
 */
public class AbeasCorp {
    
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public void copyFlights(ArrayList<Flight> temp){
        for(int i=0;i<flights.size();i++){
            temp.add(flights.get(i));
        }

    }

    public int maxGain(){
        ArrayList<Flight> temp = new ArrayList<Flight>();
        copyFlights(temp);
        int max =0;
        String names = "";
        for(int i=0;i<10;i++) {
            Collections.shuffle(temp);
            int gain = temp.get(0).getPrice();
            int time = temp.get(0).getDeparture() + temp.get(0).getDuration();
            String name = temp.get(0).getName();
            for(int j=1;j<temp.size();j++){
                if(temp.get(j).getDeparture()>= time){
                    time = temp.get(j).getDeparture() + temp.get(j).getDuration() + time;
                    gain = gain + temp.get(j).getPrice();
                    name = name +" "+ temp.get(j).getName();
                }
            }
            if(gain > max){
                max = gain;
                names = name;
            }
        }
        System.out.println(names);
        return max;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
