package railwaystation.cargo.industrialcargo;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Bulk;
import railwaystation.cargo.interfacescondition.IndustrialCargo;

public class Sand extends CommodityCargo implements Bulk, IndustrialCargo{
    
    public Sand() {
        this.setTypeOfCargo("Sand");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 1500/1000);
    }
}
