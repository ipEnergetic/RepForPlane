package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.direction.Direction;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.Passenger;
import railwaystation.cargo.passengers.BuisnesPass;

public class PassengerManager extends Manager {
    private ArrayList<Passenger> listPassangers;
    private Direction directionOfDelivery;
    int buisnesPass;
    int plackartPass;
    int commonPass;
    int sittingPass;


    public void genPassangers() {
        listPassangers = new ArrayList<Passenger>();
        buisnesPass = (int)(20 + Math.random() * 40);
        plackartPass = (int)(40 + Math.random() * 60);
        commonPass = (int)(40 + Math.random() * 60);
        sittingPass = (int)(60 + Math.random() * 200);
        for (int i = 0; i < buisnesPass; i++) {
            listPassangers.add(new BuisnesPass());
        }
        for (int i = 0; i < plackartPass; i++) {
            listPassangers.add(new BuisnesPass());
        }
        for (int i = 0; i < commonPass; i++) {
            listPassangers.add(new BuisnesPass());
        }
        for (int i = 0; i < sittingPass; i++) {
            listPassangers.add(new BuisnesPass());
        }
    }

    @Override
    public void genDirection() {
        int randDirection = (int)(Math.random() * Direction.listDirections.size());
        directionOfDelivery = Direction.listDirections.get(randDirection);
    }

    public void genDelivery() {
        genPassangers();
        genDirection();
    }

    public void printDelivery() {
        printDirectionOfDelivery();
        System.out.println();
        printListPass();

    }

    public void printListPass() {
        System.out.println(String.format("|%8s|%9s|%9s|%8s|", "Buisnes", "Plackart", "Common", "Sitting"));
        System.out.println(String.format("|%8d|%9d|%9d|%8d|", buisnesPass, plackartPass, commonPass, sittingPass));
    }

    public void printDirectionOfDelivery() {
        System.out.println(String.format("|%18s|%22s|%25s|", "City of delivery", "Distance of delivery",
                                         "Is direction electricity"));
        System.out.println(String.format("|%18s|%19s km|%25s|", directionOfDelivery.getCityOfDilivery(),
                                         directionOfDelivery.getDistance(), directionOfDelivery.isIsElectricity()));
    }
}
