package railwaystation.drivingplatforms.locomotives.diesel;

import railwaystation.drivingplatforms.locomotives.electro.LocoEl3000;

public class LocoD3000 extends DieselLoco{
    
    public LocoD3000(){
        this.setTypeLoco("LocoD3000");
        this.setLengthLoco(15);
        this.setWeightLoco(25);
        this.setMaxTransportedMassLoco(3000);
    }
}
