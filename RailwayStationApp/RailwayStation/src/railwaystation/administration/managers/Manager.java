package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.direction.Direction;

import railwaystation.cargo.CommodityCargo;

public abstract class Manager {
    private ArrayList<CommodityCargo> listCargo = new ArrayList<CommodityCargo>();
    private Direction directionOfDelivery;

    public void setListCargo(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;
    }

    public ArrayList<CommodityCargo> getListCargo() {
        return listCargo;
    }

    public void setDirectionOfDelivery(Direction directionOfDelivery) {
        this.directionOfDelivery = directionOfDelivery;
    }

    public Direction getDirectionOfDelivery() {
        return directionOfDelivery;
    }
}

