package railwaystation.administration.direction;

import railwaystation.administration.direction.interfaces.Diesel;
import railwaystation.administration.direction.interfaces.Electricity;

public class DieselDirection extends Direction implements Diesel {

    public DieselDirection(String cityOfDilivery, int distance, boolean isElectricity) {
        this.setCityOfDilivery(cityOfDilivery);
        this.setDistance(distance);
        this.setIsElectricity(isElectricity);
    }
}
