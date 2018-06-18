package railwaystation.deliveries;

import java.util.ArrayList;

import railwaystation.deliveries.cargo.Passenger;
import railwaystation.deliveries.cargo.passengers.BuisnesPass;
import railwaystation.deliveries.cargo.passengers.CommonPass;
import railwaystation.deliveries.cargo.passengers.PlackartPass;
import railwaystation.deliveries.cargo.passengers.SittingPass;
import railwaystation.deliveries.directions.Direction;

public class PassDelivery extends Delivery {
    private ArrayList<ArrayList<Passenger>> listPassangers = new ArrayList<ArrayList<Passenger>>();
    private ArrayList<Passenger> listPassBuisness = new ArrayList<Passenger>();
    private ArrayList<Passenger> listPassPlackart = new ArrayList<Passenger>();
    private ArrayList<Passenger> listPassCommon = new ArrayList<Passenger>();
    private ArrayList<Passenger> listPassSitting = new ArrayList<Passenger>();
    private Direction directionOfDelivery = new Direction();
    private int buisnesPass;
    private int plackartPass;
    private int commonPass;
    private int sittingPass;


    public PassDelivery() {
        genPassangers();
        directionOfDelivery = genDirection();
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

    public Direction genDirection() {
        int randDirection = (int)(Math.random() * Direction.listDirections.size());
        return Direction.listDirections.get(randDirection);
    }

    @Override
    public String toString() {

        String s =
            String.format("|%18s|%22s|%25s|\n", "City of delivery", "Distance of delivery", "Is direction electricity");
        s =
  s + String.format("|%18s|%19s km|%25s|\n\n", directionOfDelivery.getCityOfDilivery(), directionOfDelivery.getDistance(),
                    directionOfDelivery.isIsElectricity());

        s = s + String.format("|%8s|%9s|%9s|%8s|\n", "Buisnes", "Plackart", "Common", "Sitting");
        s = s + String.format("|%8d|%9d|%9d|%8d|\n", buisnesPass, plackartPass, commonPass, sittingPass);
        return s;
    }

    public void setListPassangers(ArrayList<ArrayList<Passenger>> listPassangers) {
        this.listPassangers = listPassangers;
    }

    public ArrayList<ArrayList<Passenger>> getListPassangers() {
        return listPassangers;
    }

    public void setListPassBuisness(ArrayList<Passenger> listPassBuisness) {
        this.listPassBuisness = listPassBuisness;
    }

    public ArrayList<Passenger> getListPassBuisness() {
        return listPassBuisness;
    }

    public void setListPassPlackart(ArrayList<Passenger> listPassPlackart) {
        this.listPassPlackart = listPassPlackart;
    }

    public ArrayList<Passenger> getListPassPlackart() {
        return listPassPlackart;
    }

    public void setListPassCommon(ArrayList<Passenger> listPassCommon) {
        this.listPassCommon = listPassCommon;
    }

    public ArrayList<Passenger> getListPassCommon() {
        return listPassCommon;
    }

    public void setListPassSitting(ArrayList<Passenger> listPassSitting) {
        this.listPassSitting = listPassSitting;
    }

    public ArrayList<Passenger> getListPassSitting() {
        return listPassSitting;
    }

    public void setDirectionOfDelivery(Direction directionOfDelivery) {
        this.directionOfDelivery = directionOfDelivery;
    }

    public Direction getDirectionOfDelivery() {
        return directionOfDelivery;
    }

    public void setBuisnesPass(int buisnesPass) {
        this.buisnesPass = buisnesPass;
    }

    public int getBuisnesPass() {
        return buisnesPass;
    }

    public void setPlackartPass(int plackartPass) {
        this.plackartPass = plackartPass;
    }

    public int getPlackartPass() {
        return plackartPass;
    }

    public void setCommonPass(int commonPass) {
        this.commonPass = commonPass;
    }

    public int getCommonPass() {
        return commonPass;
    }

    public void setSittingPass(int sittingPass) {
        this.sittingPass = sittingPass;
    }

    public int getSittingPass() {
        return sittingPass;
    }
}
