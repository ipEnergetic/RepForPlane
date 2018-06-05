package railwaystation.blocktrains.locomotives.diesellokomotives;

import railwaystation.blocktrains.locomotives.Locomotive;
import railwaystation.blocktrains.locomotives.LokomotiveDiesel;

public class LocoDieselType1 extends Locomotive implements LokomotiveDiesel{

    @Override
    public void moveBlockTrains() {
        System.out.println("LocoDieselType1 set in motion the blocktrain on diesel");
    }

    @Override
    public void moveOnDiesel() {
    }
}
