package railwaystation.deliveries.cargo.food;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Food;
import railwaystation.deliveries.cargo.interfacescondition.Packed;

public class Meat extends CommodityCargo implements Packed, Food{

    public Meat() {
        this.setTypeOfCargo("Meat");
        /*
         * Выбираем рандомно количество от 20м3 до 400м3
         */
        this.setVolumeOfCargo((int)(20 + Math.random() * 180));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 1100/1000);
    }
}