package railwaystation.drivingplatforms.blocktrains;

import java.util.ArrayList;

import railwaystation.administration.managers.managers.CommodityWagManager;
import railwaystation.administration.managers.managers.LocoManager;

import railwaystation.deliveries.CommodityDelivery;

import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.locomotives.Loco;
import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;


public class CommodityBlocktrain extends BlockTrain {
    private ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    private ArrayList<Loco> listLoco = new ArrayList<Loco>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private ArrayList<DrivingPlatform> listBlockTrain = new ArrayList<DrivingPlatform>();
    private int totalLengthBlocktrain;
    private int totalCountWagons;


    public CommodityBlocktrain(CommodityDelivery commodityDelivery) {
        CommodityWagManager commodityWagManager = new CommodityWagManager(commodityDelivery.getListCargo());
        listWagons = commodityWagManager.getWagonsList();
        groupOfWagons = commodityWagManager.getGroupOfWagons();
        LocoManager locoManager =
            new LocoManager(commodityDelivery.getDirectionOfDelivery(), commodityDelivery.getTotalWeightCargo() +
                            commodityWagManager.getTotalWeightWagons());
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
        if (listLoco.size() == 2) {
            s = s + String.format("|Type second locomotive |%13s|\n", listLoco.get(1).getTypeLoco());
        }
        s =
  s + String.format("|%15s|%18s|%15s|%15s|\n", "Type of Cargo", "Type of Wagon", "Count of wagons", "Total Length");
        for (GroupOfWagons group : this.groupOfWagons) {
            s =
  s + String.format("|%15s|%18s|%15d|%15d|\n", group.getTypeCargo(), group.getTypeWagons(), group.getCountWagons(),
                    group.getTotalLength());
        }
        s = s + String.format("|%34s|%15d|%15d|\n", "TOTAL PARAMETERS", totalCountWagons, totalLengthBlocktrain);
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

    public void setListBlockTrain(ArrayList<DrivingPlatform> listBlockTrain) {
        this.listBlockTrain = listBlockTrain;
    }

    public ArrayList<DrivingPlatform> getListBlockTrain() {
        return listBlockTrain;
    }
}
