package railwaystation.deliveries.cargo.dangerouscargo;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Gaseus;

public class Gas extends CommodityCargo implements Gaseus, Dangerous{

    public Gas() {
        this.setTypeOfCargo("Gas");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 500/1000);

    }
    
}
