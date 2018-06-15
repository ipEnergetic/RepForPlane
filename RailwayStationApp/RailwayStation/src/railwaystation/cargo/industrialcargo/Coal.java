package railwaystation.cargo.industrialcargo;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Bulk;
import railwaystation.cargo.interfacescondition.IndustrialCargo;
import railwaystation.cargo.dangerouscargo.Gas;

public class Coal extends CommodityCargo implements Bulk, IndustrialCargo{

    public Coal() {
        this.setTypeOfCargo("Coal");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 2600/1000);

    }
}
