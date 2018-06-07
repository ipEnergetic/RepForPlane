package railwaystation.dispatcher.deliver;

import java.sql.Time;

import java.util.ArrayList;

import railwaystation.cargo.Cargo;


public class OrderDelivery extends Cargo{
    private DirectionDelivery direction;
    private Time startTimeOfDelivery;
    private Time finishTimeOfDelivery;

    public OrderDelivery(DirectionDelivery direction, ArrayList<Cargo> listOfCargo, Time timeOfDelivery) {
    }

    public void drawUpOrder() {
    }
}
