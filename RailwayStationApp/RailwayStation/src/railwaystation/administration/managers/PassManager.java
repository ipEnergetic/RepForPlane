package railwaystation.administration.managers;

import java.util.ArrayList;
import railwaystation.administration.direction.Direction;
import railwaystation.cargo.Passenger;
import railwaystation.cargo.passengers.BuisnesPass;
import railwaystation.cargo.passengers.CommonPass;
import railwaystation.cargo.passengers.PlackartPass;
import railwaystation.cargo.passengers.SittingPass;

public class PassManager extends Manager {
    private ArrayList<ArrayList<Passenger>> listPassangers = new ArrayList<ArrayList<Passenger>>();
    private ArrayList<Passenger> listPassBuisness = new ArrayList <Passenger>();
    private ArrayList<Passenger> listPassPlackart = new ArrayList <Passenger>();
    private ArrayList<Passenger> listPassCommon = new ArrayList <Passenger>();
    private ArrayList<Passenger> listPassSitting = new ArrayList <Passenger>();
    private Direction directionOfDelivery;
    private int buisnesPass;
    private int plackartPass;
    private int commonPass;
    private int sittingPass;


    public PassManager() {
        genPassangers();
        genDelivery();
    }

    public void genPassangers() {
        buisnesPass = (int)(40 + Math.random() * 80);
        plackartPass = (int)(80 + Math.random() * 140);
        commonPass = (int)(80 + Math.random() * 200);
        sittingPass = (int)(130 + Math.random() * 400);
        for (int i = 0; i < buisnesPass; i++) {
            listPassBuisness.add(new BuisnesPass());
        }
        for (int i = 0; i < plackartPass; i++) {
            listPassPlackart.add(new PlackartPass());
        }
        for (int i = 0; i < commonPass; i++) {
            listPassCommon.add(new CommonPass());
        }
        for (int i = 0; i < sittingPass; i++) {
            listPassSitting.add(new SittingPass());
        }
        listPassangers.add(listPassBuisness);
        listPassangers.add(listPassCommon);
        listPassangers.add(listPassPlackart);
        listPassangers.add(listPassSitting);
    }
    
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

    //    public void setListPassangers(ArrayList<Passenger> listPassangers) {
    //        this.listPassangers = listPassangers;
    //    }
    //
    //    public ArrayList<Passenger> getListPassangers() {
    //        return listPassangers;
    //    }


    public void setListPassangers(ArrayList<ArrayList<Passenger>> listPassangers) {
        this.listPassangers = listPassangers;
    }

    public ArrayList<ArrayList<Passenger>> getListPassangers() {
        return listPassangers;
    }
}