package railwaystation.deliveries;

import java.util.ArrayList;

import railwaystation.deliveries.cargo.Cargo;
import railwaystation.deliveries.directions.Direction;

public abstract class Delivery {
    private Direction directionOfDelivery;

    public void setDirectionOfDelivery(Direction directionOfDelivery) {
        this.directionOfDelivery = directionOfDelivery;
    }

    public Direction getDirectionOfDelivery() {
        return directionOfDelivery;
    }
}
