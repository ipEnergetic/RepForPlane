package railwaystation.cargo.food;

import railwaystation.administration.direction.interfaces.DeliverFood;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Packed;

public class Meat extends Cargo implements Packed, DeliverFood{

    public Meat() {
        this.setTypeOfCargo("Meat");
        /*
         * Выбираем рандомно количество от 20м3 до 400м3
         */
        this.setVolumeOfCargo((int)(20 + Math.random() * 180));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 1100/1000);
    }
}
