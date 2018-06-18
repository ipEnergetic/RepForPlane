package railwaystation.deliveries.directions;

import railwaystation.deliveries.directions.interfaces.Diesel;
import railwaystation.deliveries.directions.interfaces.Electricity;

public class DieselDirection extends Direction implements Diesel {

    public DieselDirection(String cityOfDilivery, int distance, boolean isElectricity) {
        this.setCityOfDilivery(cityOfDilivery);
        this.setDistance(distance);
        this.setIsElectricity(isElectricity);
    }
}
