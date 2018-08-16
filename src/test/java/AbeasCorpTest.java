import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mhz on 22/12/17.
 */
public class AbeasCorpTest {

    @Test
    public void copyFlightsTest() throws Exception {

        //given
        Flight flight1 = new Flight("x",0,5,10);
        Flight flight2 = new Flight("y",0,5,10);
        Flight flight3 = new Flight("z",0,5,10);

        AbeasCorp abeasCorp = new AbeasCorp();
        abeasCorp.getFlights().add(flight1);
        abeasCorp.getFlights().add(flight2);
        abeasCorp.getFlights().add(flight3);

        //when
        ArrayList<Flight> temp = new ArrayList<Flight>();
        abeasCorp.copyFlights(temp);

        //then
        Assert.assertEquals("x",temp.get(0).getName());
        Assert.assertEquals("y",temp.get(1).getName());
        Assert.assertEquals("z",temp.get(2).getName());
    }

    @Test
    public void maxGainTest() throws Exception {

        //given
        Flight flight1 = new Flight("AF514",0,5,10);
        Flight flight2 = new Flight("CO5",3,7,14);
        Flight flight3 = new Flight("AF515",5,9,7);
        Flight flight4 = new Flight("BA01",6,9,8);

        AbeasCorp abeasCorp = new AbeasCorp();
        abeasCorp.getFlights().add(flight1);
        abeasCorp.getFlights().add(flight2);
        abeasCorp.getFlights().add(flight3);
        abeasCorp.getFlights().add(flight4);

        //when
        int max = abeasCorp.maxGain();

        //then
        Assert.assertEquals(18,max);
    }

}