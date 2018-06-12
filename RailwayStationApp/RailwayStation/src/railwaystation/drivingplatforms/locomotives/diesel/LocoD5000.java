package railwaystation.drivingplatforms.locomotives.diesel;

public class LocoD5000 extends DieselLoco {

    public LocoD5000(){
        this.setTypeLoco("LocoD5000");
        this.setLengthLoco(15);
        this.setWeightLoco(25);
        this.setMaxTransportedMassLoco(5000);
    }
}
