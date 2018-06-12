package railwaystation.cargo.dangerouscargo;

import railwaystation.administration.direction.interfaces.DeliverGas;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Gaseus;

public class Gas extends CommodityCargo implements Gaseus, Dangerous, DeliverGas{

    public Gas() {
        this.setTypeOfCargo("Gas");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 500/1000);

    }
    
}
