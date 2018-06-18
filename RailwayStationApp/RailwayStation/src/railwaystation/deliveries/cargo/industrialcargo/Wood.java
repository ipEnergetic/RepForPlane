package railwaystation.deliveries.cargo.industrialcargo;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.IndustrialCargo;

public class Wood extends CommodityCargo implements IndustrialCargo {

    public Wood() {
        this.setTypeOfCargo("Wood");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 700 / 1000);
    }
}
