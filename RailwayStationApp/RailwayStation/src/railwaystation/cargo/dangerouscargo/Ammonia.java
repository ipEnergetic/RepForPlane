package railwaystation.cargo.dangerouscargo;

import railwaystation.administration.direction.interfaces.DeliverAmmonia;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Gaseus;


public class Ammonia extends CommodityCargo implements Gaseus, Dangerous, DeliverAmmonia{

    public Ammonia() {
        this.setTypeOfCargo("Ammonia");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 600/1000);
    }
}
