package railwaystation.deliveries.cargo.dangerouscargo;


import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Flow;

public class Gasoline extends CommodityCargo implements Flow, Dangerous {

    public Gasoline() {
        this.setTypeOfCargo("Gasoline");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 750/1000);
    }
}
