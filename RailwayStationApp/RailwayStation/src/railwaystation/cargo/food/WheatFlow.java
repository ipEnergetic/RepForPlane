package railwaystation.cargo.food;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Flow;

public class WheatFlow extends Cargo implements Flow{

    public WheatFlow() {
        this.setTypeOfCargo("Wheat");
        /*
         * Выбираем рандомно количество от 70м3 до 1400м3
         */
        this.setVolumeOfCargo((int)(70 + Math.random() * 1330));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 800/1000);
    }
}
