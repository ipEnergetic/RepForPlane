package railwaystation.dispatcher;

import java.sql.Time;

import java.util.ArrayList;

import railwaystation.cargo.Cargo;

public class DeliveryOrder {
    private DirectionOfDelivery direction;
    private Cargo cargo;
    private Time startTimeOfDelivery;
    private Time finishTimeOfDelivery;

    public DeliveryOrder() {
    }

    public DeliveryOrder(DirectionOfDelivery direction, ArrayList<Cargo> listOfCargo, Time timeOfDelivery) {
    }

    public void drawUpOrder() {
    }
}
