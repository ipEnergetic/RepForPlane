package railwaystation.cargo.industrialcargo;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.condition.Bulk;
import railwaystation.cargo.condition.IndustrialCargo;

public class Macadam extends CommodityCargo implements Bulk, IndustrialCargo{

    public Macadam() {
        this.setTypeOfCargo("Macadam");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 1400/1000);
    }
}
