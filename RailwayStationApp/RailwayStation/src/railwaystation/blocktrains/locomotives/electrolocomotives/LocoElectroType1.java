package railwaystation.blocktrains.locomotives.electrolocomotives;

import railwaystation.blocktrains.locomotives.Locomotive;
import railwaystation.blocktrains.locomotives.LocomotiveElectro;

public class LocoElectroType1 extends Locomotive implements LocomotiveElectro{

    @Override
    public void moveBlockTrains() {
        System.out.println("LocoElectroType1 set in motion the blocktrain on electric");
    }

    @Override
    public void moveOnElectro() {
    }
}
