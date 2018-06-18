package railwaystation.deliveries.cargo.food;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Flow;
import railwaystation.deliveries.cargo.interfacescondition.Food;

public class WheatFlow extends CommodityCargo implements Food, Flow{

    public WheatFlow() {
        this.setTypeOfCargo("Wheat");
        /*
         * Выбираем рандомно количество от 70м3 до 1400м3
         */
        this.setVolumeOfCargo((int)(70 + Math.random() * 1330));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 800/1000);
    }
}
