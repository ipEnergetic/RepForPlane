package railwaystation.cargo.industrialcargo;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.dangerouscargo.Gas;

public class Coal extends Cargo {

    public Coal() {
        this.setTypeOfCargo("Coal");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 2600/1000);

    }
}
