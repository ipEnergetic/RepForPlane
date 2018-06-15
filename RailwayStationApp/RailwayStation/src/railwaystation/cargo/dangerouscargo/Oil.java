package railwaystation.cargo.dangerouscargo;

import railwaystation.administration.direction.interfaces.DeliverOil;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Dangerous;
import railwaystation.cargo.interfacescondition.Flow;

public class Oil extends CommodityCargo implements Flow, DeliverOil, Dangerous {

    public Oil() {
        this.setTypeOfCargo("Oil");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 900/1000);
    }
}
