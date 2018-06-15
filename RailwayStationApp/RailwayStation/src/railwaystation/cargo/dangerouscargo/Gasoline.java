package railwaystation.cargo.dangerouscargo;

import railwaystation.administration.direction.interfaces.DeliverGasoline;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Dangerous;
import railwaystation.cargo.interfacescondition.Flow;

public class Gasoline extends CommodityCargo implements Flow, Dangerous, DeliverGasoline {

    public Gasoline() {
        this.setTypeOfCargo("Gasoline");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 750/1000);
    }
}
