package railwaystation.cargo.food;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Food;
import railwaystation.cargo.interfacescondition.Packed;

public class WheatPacked extends CommodityCargo implements Food, Packed {
    
    public WheatPacked() {
        this.setTypeOfCargo("WheatPacket");
        /*
         * Выбираем рандомно количество от 40м3 до 800м3
         */
        this.setVolumeOfCargo((int)(40 + Math.random() * 760));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 800/1000);
    }
}
