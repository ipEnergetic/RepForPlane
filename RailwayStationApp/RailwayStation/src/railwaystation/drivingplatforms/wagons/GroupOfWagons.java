package railwaystation.drivingplatforms.wagons;

import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.locomotives.Loco;

public class GroupOfWagons extends DrivingPlatform {
    private String typeCargo;
    private String typeWagons;
    private int weightWagon;
    private int countWagons;
    private int totalLength;
    private int totalWeight;

    public GroupOfWagons(String typeCargo, String typeWagons, int lengthWagon, int weightWagon, int countWagons) {
        this.setTypeCargo(typeCargo);
        this.setTypeWagons(typeWagons);
        this.setCountWagons(countWagons);
        this.setTotalLength(countWagons * lengthWagon);
        this.setTotalWeight(countWagons * weightWagon);
    }

    public void setTypeCargo(String typeCargo) {
        this.typeCargo = typeCargo;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public void setTypeWagons(String typeWagons) {
        this.typeWagons = typeWagons;
    }

    public String getTypeWagons() {
        return typeWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setWeightWagon(int weightWagon) {
        this.weightWagon = weightWagon;
    }

    public int getWeightWagon() {
        return weightWagon;
    }

    public class LocoEl5000 extends ElectroLoco{

    public LocoEl5000() {
        this.setTypeLoco("LocoEl5000");
        this.setLengthLoco(15);
        this.setWeightLoco(25);
        this.setMaxTransportedMassLoco(5000);
    }
}

    public class LocoEl7000 extends ElectroLoco{

    public LocoEl7000(){
        this.setTypeLoco("LocoEl7000");
        this.setLengthLoco(15);
        this.setWeightLoco(25);
        this.setMaxTransportedMassLoco(7000);
    }
}

    public class LocoEl3000 extends ElectroLoco{

    public LocoEl3000(){
        this.setTypeLoco("LocoEl3000");
        this.setLengthLoco(15);
        this.setWeightLoco(25);
        this.setMaxTransportedMassLoco(3000);
    }
}

    public class ElectroLoco extends Loco {

        @Override
        public void moveBlockTrains() {
        }
    }
}
