package railwaystation.cargo.industrialcargo;

import railwaystation.cargo.Cargo;

public class Sand extends Cargo{
    
    public Sand() {
        this.setTypeOfCargo("Sand");
        /*
         * Выбираем рандомно количество от 60м3 до 1200м3
         */
        this.setVolumeOfCargo((int)(60 + Math.random() * 1140));
        this.setWeightOfCargo(this.getVolumeOfCargo() * 1500/1000);
    }
}
