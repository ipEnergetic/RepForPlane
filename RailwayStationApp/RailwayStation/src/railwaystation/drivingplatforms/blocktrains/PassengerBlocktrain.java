package railwaystation.drivingplatforms.blocktrains;

import java.util.ArrayList;

import railwaystation.administration.managers.managers.LocoManager;
import railwaystation.administration.managers.managers.PassWagonManager;

import railwaystation.deliveries.Delivery;
import railwaystation.deliveries.PassDelivery;

import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.locomotives.Loco;
import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;


public class PassengerBlocktrain extends BlockTrain {
    private ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    private ArrayList<Loco> listLoco = new ArrayList<Loco>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private ArrayList<DrivingPlatform> listBlockTrain = new ArrayList<DrivingPlatform>();
    private int totalLengthBlocktrain;
    private int totalCountWagons;

    public PassengerBlocktrain(PassDelivery passDelivery) {
        PassWagonManager passWagonManager = new PassWagonManager(passDelivery.getListPassangers());
        listWagons = passWagonManager.getWagonsList();
        groupOfWagons = passWagonManager.getGroupOfWagons();
        LocoManager locoManager =
            new LocoManager(passDelivery.getDirectionOfDelivery(), passWagonManager.getTotalWeightWagons());
        ;
        listLoco = locoManager.getListLoco();
        listBlockTrain.addAll(listLoco);
        listBlockTrain.addAll(listWagons);
        totalLengthBlocktrain = getTotalLengthBlocktrain(listWagons, listLoco);
        totalCountWagons = listWagons.size();
    }

    public int getTotalLengthBlocktrain(ArrayList<Wagon> listWagon, ArrayList<Loco> listLoco) {
        int totalLengthTrain = 0;
        for (Wagon wag : listWagon) {
            totalLengthTrain = totalLengthTrain + wag.getLengthWagon();
        }
        for (Loco loco : listLoco) {
            totalLengthTrain = totalLengthTrain + loco.getLengthLoco();
        }
        return totalLengthTrain;
    }
    
    @Override
    public String toString() {
        
        String s = String.format("|Type main locomotive |%15s|\n", listLoco.get(0).getTypeLoco());
        s =
    s + String.format("|%23s|%18s|%15s|%15s|\n", "Type of Passengers", "Type of Wagon", "Count of wagons", "Total Length");
        for (GroupOfWagons group : this.groupOfWagons) {
            s =
    s + String.format("|%23s|%18s|%15d|%15d|\n", group.getTypeCargo(), group.getTypeWagons(), group.getCountWagons(),
                    group.getTotalLength());
        }
        s = s + String.format("|%42s|%15d|%15d|\n", "TOTAL PARAMETERS", totalCountWagons, totalLengthBlocktrain);
        return s;
    }


    public void setListWagons(ArrayList<Wagon> listWagons) {
        this.listWagons = listWagons;
    }

    public ArrayList<Wagon> getListWagons() {
        return listWagons;
    }

    public void setListLoco(ArrayList<Loco> listLoco) {
        this.listLoco = listLoco;
    }

    public ArrayList<Loco> getListLoco() {
        return listLoco;
    }

    public void setGroupOfWagons(ArrayList<GroupOfWagons> groupOfWagons) {
        this.groupOfWagons = groupOfWagons;
    }

    public ArrayList<GroupOfWagons> getGroupOfWagons() {
        return groupOfWagons;
    }

    public void setListBlockTrain(ArrayList<DrivingPlatform> listBlockTrain) {
        this.listBlockTrain = listBlockTrain;
    }

    public ArrayList<DrivingPlatform> getListBlockTrain() {
        return listBlockTrain;
    }

    public void setTotalLengthBlocktrain(int totalLengthBlocktrain) {
        this.totalLengthBlocktrain = totalLengthBlocktrain;
    }

    public int getTotalLengthBlocktrain() {
        return totalLengthBlocktrain;
    }

    public void setTotalCountWagons(int totalCountWagons) {
        this.totalCountWagons = totalCountWagons;
    }

    public int getTotalCountWagons() {
        return totalCountWagons;
    }
}
