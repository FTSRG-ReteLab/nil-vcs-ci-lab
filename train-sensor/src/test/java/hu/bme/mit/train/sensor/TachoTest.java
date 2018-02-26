package hu.bme.mit.train.sensor;

import hu.bme.mit.train.tacho.TachoGraph;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by meres on 2/26/18.
 */
public class TachoTest {

    @Test
    public void testTable(){
        TachoGraph graph = new TachoGraph();
        graph.addRow(1, 1, 1);
        Assert.assertEquals(graph.size(), 1);
    }
}
