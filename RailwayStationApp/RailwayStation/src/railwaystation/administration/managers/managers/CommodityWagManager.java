package railwaystation.administration.managers.managers;


import java.util.ArrayList;

import railwaystation.administration.managers.factories.CommodityWagFactory;

import railwaystation.deliveries.cargo.CommodityCargo;

import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;

public class CommodityWagManager {
    private ArrayList<Wagon> wagonsList = new ArrayList<Wagon>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private ArrayList<CommodityCargo> listCargo;
    private int countTypeWagonInBlocTrainl;
    private int countWagonInGroupOfWagons;
    private int totalCountWagonInBlocTrainl;
    private int totalWeightWagons;
    private int totalLengthWagons;

    public CommodityWagManager(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;
        CommodityWagFactory comWagFactory = new CommodityWagFactory();
        for (int i = 0; i < listCargo.size(); i++) {
            int volumeCargo = listCargo.get(i).getVolumeOfCargo();
            while (volumeCargo > 0) {
                wagonsList.add(comWagFactory.genWagonCommodityCargo(listCargo.get(i), volumeCargo));
                volumeCargo = volumeCargo - wagonsList.get(wagonsList.size() - 1).getValume();
                countWagonInGroupOfWagons = countWagonInGroupOfWagons + 1;
                totalCountWagonInBlocTrainl = totalCountWagonInBlocTrainl + 1;
            }
            countTypeWagonInBlocTrainl = countTypeWagonInBlocTrainl + 1;
            groupOfWagons.add(new GroupOfWagons(listCargo.get(i).getTypeOfCargo(),
                                                wagonsList.get((wagonsList.size() - 1)).getTypeWagon(),
                                                wagonsList.get((wagonsList.size() - 1)).getLengthWagon(),
                                                wagonsList.get((wagonsList.size() - 1)).getWeightWagon(),
                                                countWagonInGroupOfWagons));
            countWagonInGroupOfWagons = 0;
        }
        this.totalWeightWagons = totalWeightWagons(this.groupOfWagons);
    }

    public int totalWeightWagons(ArrayList<GroupOfWagons> groupOfWag) {
        int totalWeightWag = 0;
        ;
        for (GroupOfWagons group : groupOfWag) {
            totalWeightWag = totalWeightWag + group.getTotalWeight();
        }
        return totalWeightWag;
    }

//    @Override
//    public String toString() {
//        String s =
//            String.format("|%25s|%18s|%15s|%15s|\n", "Type of Cargo", "Type of Wagon", "Count of wagons", "Total Length",
//                          "Count of Cargo");
//        for (GroupOfWagons group : groupOfWagons) {
//            s =
//  s + String.format("|%25s|%18s|%15d|%15d|\n", group.getTypeCargo(), group.getTypeWagons(), group.getCountWagons(),
//                    group.getTotalLength());
//            totalLengthWagons = totalLengthWagons + group.getTotalLength();
//        }
//        s =
//  s + String.format("|%44s|%15d|%15d|\n", "TOTAL PARAMETERS: ", totalCountWagonInBlocTrainl, totalLengthWagons);
//        return s;
//    }


    public void setWagonsList(ArrayList<Wagon> wagonsList) {
        this.wagonsList = wagonsList;
    }

    public ArrayList<Wagon> getWagonsList() {
        return wagonsList;
    }

    public void setGroupOfWagons(ArrayList<GroupOfWagons> groupOfWagons) {
        this.groupOfWagons = groupOfWagons;
    }

    public ArrayList<GroupOfWagons> getGroupOfWagons() {
        return groupOfWagons;
    }

    public void setListCargo(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;
    }

    public ArrayList<CommodityCargo> getListCargo() {
        return listCargo;
    }

    public void setCountTypeWagonInBlocTrainl(int countTypeWagonInBlocTrainl) {
        this.countTypeWagonInBlocTrainl = countTypeWagonInBlocTrainl;
    }

    public int getCountTypeWagonInBlocTrainl() {
        return countTypeWagonInBlocTrainl;
    }

    public void setCountWagonInGroupOfWagons(int countWagonInGroupOfWagons) {
        this.countWagonInGroupOfWagons = countWagonInGroupOfWagons;
    }

    public int getCountWagonInGroupOfWagons() {
        return countWagonInGroupOfWagons;
    }

    public void setTotalCountWagonInBlocTrainl(int totalCountWagonInBlocTrainl) {
        this.totalCountWagonInBlocTrainl = totalCountWagonInBlocTrainl;
    }

    public int getTotalCountWagonInBlocTrainl() {
        return totalCountWagonInBlocTrainl;
    }

    public void setTotalLengthOfWagons(int totalLengthOfWagons) {
        this.totalLengthWagons = totalLengthOfWagons;
    }

    public int getTotalLengthOfWagons() {
        return totalLengthWagons;
    }

    public void setTotalWeightWagons(int totalWeightWagons) {
        this.totalWeightWagons = totalWeightWagons;
    }

    public int getTotalWeightWagons() {
        return totalWeightWagons;
    }
}
