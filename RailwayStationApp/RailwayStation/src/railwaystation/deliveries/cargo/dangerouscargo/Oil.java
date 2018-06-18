package railwaystation.deliveries.cargo.dangerouscargo;


import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Flow;

public class Oil extends CommodityCargo implements Flow,Dangerous {

    public Oil() {
        this.setTypeOfCargo("Oil");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setVolumeOfCargo((int)(80 + Math.random() * 1520));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 900/1000);
    }
}
