package railwaystation.cargo.dangerouscargo;

import railwaystation.administration.direction.interfaces.DeliverOil;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Flow;

public class Oil extends Cargo implements Flow, DeliverOil {

    public Oil() {
        this.setTypeOfCargo("Oil");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 900/1000);
    }
}
