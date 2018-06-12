package railwaystation.cargo.food;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.condition.Flow;
import railwaystation.cargo.condition.Food;

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
