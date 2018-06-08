package railwaystation.cargo.food;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Packed;

public class WheatPacked extends Cargo implements Packed {
    
    public WheatPacked() {
        this.setTypeOfCargo("WheatPacket");
        /*
         * Выбираем рандомно количество от 70м3 до 1400м3
         */
        this.setVolumeOfCargo((int)(40 + Math.random() * 760));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 800/1000);
    }
}
