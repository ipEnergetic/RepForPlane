package railwaystation.deliveries.directions;

import railwaystation.deliveries.directions.interfaces.Electricity;

public class ElectricityDirection extends Direction implements Electricity {

    public ElectricityDirection(String cityOfDilivery, int distance, boolean isElectricity) {
        this.setCityOfDilivery(cityOfDilivery);
        this.setDistance(distance);
        this.setIsElectricity(isElectricity);
    }
}

