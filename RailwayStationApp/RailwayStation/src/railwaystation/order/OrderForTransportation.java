package railwaystation.order;

import java.sql.Time;

import java.util.ArrayList;

import railwaystation.order.cargo.Cargo;

public class OrderForTransportation {
    private Direction direction;
    private Cargo cargo;
    private Time startTimeOfDelivery;
    private Time finishTimeOfDelivery;
    
    public OrderForTransportation(Direction direction, ArrayList <Cargo> listOfCargo, Time timeOfDelivery){
        
    }

    public void drawUpOrder() { 
        
    }
}
