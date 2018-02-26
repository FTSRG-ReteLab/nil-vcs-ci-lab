package hu.bme.mit.train.tacho;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

import java.util.Timer;

/**
 * Created by meres on 2/26/18.
 */




public class TachoGraph {
    Table<Double, Double, Double> table = TreeBasedTable.create();

    public void addRow(double time, double pos, double speed){
        table.put(time, pos, speed);
    }

    public int size(){
        return table.size();
    }

}
