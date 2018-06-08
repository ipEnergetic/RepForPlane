package railwaystation.administration.managers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.Passenger;
import railwaystation.cargo.dangerouscargo.Ammonia;
import railwaystation.cargo.dangerouscargo.Gas;
import railwaystation.cargo.dangerouscargo.Gasoline;
import railwaystation.cargo.dangerouscargo.Oil;
import railwaystation.cargo.food.Meat;
import railwaystation.cargo.food.WheatFlow;
import railwaystation.cargo.food.WheatPacked;
import railwaystation.cargo.industrialcargo.Coal;
import railwaystation.cargo.industrialcargo.Macadam;
import railwaystation.cargo.industrialcargo.Sand;
import railwaystation.cargo.industrialcargo.Wood;

import railwaystation.administration.direction.Direction;


public class CargoManager extends Manager {
    private ArrayList<Cargo> listCargo;
    private Direction directionOfDelivery;


    public void genTypeCargo() {
        listCargo = new ArrayList<Cargo>();
        Set setRepeat = new HashSet();
        int randCountTypeCargo = (int)(4 + Math.random() * 3);
        for (int i = 0; i < randCountTypeCargo; i++) {
            int randTypeCargo = (int)(1 + Math.random() * 10);
            if (setRepeat.contains(randTypeCargo)) {
                i = i - 1;
                continue;
            }
            setRepeat.add(randTypeCargo);
            switch (randTypeCargo) {
            case 1:
                listCargo.add(new Ammonia());
                break;
            case 2:
                listCargo.add(new Gas());
                break;
            case 3:
                listCargo.add(new Gasoline());
                break;
            case 4:
                listCargo.add(new Oil());
                break;
            case 5:
                listCargo.add(new Meat());
                break;
            case 6:
                listCargo.add(new Coal());
                break;
            case 7:
                listCargo.add(new Wood());
                break;
            case 8:
                listCargo.add(new Macadam());
                break;
            case 9:
                listCargo.add(new Sand());
                break;
            case 10:
                listCargo.add(new WheatPacked());
                break;
            case 11:
                listCargo.add(new WheatFlow());
                break;
            }
        }
    }

    public void genDirection() {
        int randDirection = (int)(Math.random() * Direction.listDirections.size());
        directionOfDelivery = Direction.listDirections.get(randDirection);
    }

    public void printListCargo() {
        System.out.println(String.format("|%14s|%16s|%17s|", "Name of Cargo", "Value of Cargo", "Weight of Cargo"));

        for (int i = 0; i < listCargo.size(); i++) {
            System.out.println(String.format("|%14s|%13d m3|%13d ton|", listCargo.get(i).getTypeOfCargo(),
                                             listCargo.get(i).getVolumeOfCargo(),
                                             listCargo.get(i).getWeightOfCargo()));
        }
    }

    public void printDirectionOfDelivery() {
        System.out.println(String.format("|%18s|%22s|%25s|", "City of delivery", "Distance of delivery",
                                         "Is direction electricity"));
        System.out.println(String.format("|%18s|%19s km|%25s|", directionOfDelivery.getCityOfDilivery(),
                                         directionOfDelivery.getDistance(), directionOfDelivery.isIsElectricity()));
    }

    public void genDelivery() {
        genTypeCargo();
        genDirection();
    }

    public void printDelivery() {
        printDirectionOfDelivery();
        System.out.println();
        printListCargo();
    }
}


