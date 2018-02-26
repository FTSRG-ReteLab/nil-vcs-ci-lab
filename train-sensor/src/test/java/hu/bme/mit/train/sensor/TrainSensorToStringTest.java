package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by meres on 2/26/18.
 */
public class TrainSensorToStringTest {


    @Test
    public void stringTest(){
        TrainSensorImpl sensor = new TrainSensorImpl( null, null);
        Assert.assertEquals(sensor.toString(), "SENSOR");
    }
}
