package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.direction.Direction;

import railwaystation.cargo.Cargo;

public abstract class Manager {
    private ArrayList<Cargo> listCargo = new ArrayList<Cargo>();
    private Direction directionOfDelivery;

    public abstract void genDirection();


    public void setListCargo(ArrayList<Cargo> listCargo) {
        this.listCargo = listCargo;
    }

    public ArrayList<Cargo> getListCargo() {
        return listCargo;
    }

    public void setDirectionOfDelivery(Direction directionOfDelivery) {
        this.directionOfDelivery = directionOfDelivery;
    }

    public Direction getDirectionOfDelivery() {
        return directionOfDelivery;
    }
}

