package railwaystation.administration.direction;

import railwaystation.administration.direction.interfaces.Electricity;

public class ElectricityDirection extends Direction implements Electricity {

    public ElectricityDirection(String cityOfDilivery, int distance, boolean isElectricity) {
        this.setCityOfDilivery(cityOfDilivery);
        this.setDistance(distance);
        this.setIsElectricity(isElectricity);
    }
}

