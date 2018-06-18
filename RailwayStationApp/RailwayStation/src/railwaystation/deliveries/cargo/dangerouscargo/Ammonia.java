package railwaystation.deliveries.cargo.dangerouscargo;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Gaseus;


public class Ammonia extends CommodityCargo implements Gaseus, Dangerous{

    public Ammonia() {
        this.setTypeOfCargo("Ammonia");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 600/1000);
    }
}
