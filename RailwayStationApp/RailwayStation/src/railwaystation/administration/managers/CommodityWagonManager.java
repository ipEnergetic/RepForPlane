package railwaystation.administration.managers;

import java.util.ArrayList;

import java.util.Arrays;

import railwaystation.administration.direction.Direction;

import railwaystation.administration.managers.factories.CommodityWagFactory;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Bulk;
import railwaystation.cargo.interfacescondition.Dangerous;
import railwaystation.cargo.interfacescondition.Food;
import railwaystation.cargo.interfacescondition.IndustrialCargo;
import railwaystation.cargo.interfacescondition.Packed;
import railwaystation.cargo.dangerouscargo.Ammonia;
import railwaystation.cargo.dangerouscargo.Gas;
import railwaystation.cargo.dangerouscargo.Gasoline;
import railwaystation.cargo.dangerouscargo.Oil;
import railwaystation.cargo.food.Meat;
import railwaystation.cargo.food.WheatFlow;
import railwaystation.cargo.industrialcargo.Wood;

import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.locomotives.Loco;
import railwaystation.drivingplatforms.locomotives.diesel.DieselLoco;
import railwaystation.drivingplatforms.locomotives.electro.ElectroLoco;
import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;
import railwaystation.drivingplatforms.wagons.commoditywag.CoveredWagon;
import railwaystation.drivingplatforms.wagons.commoditywag.HopperFood;
import railwaystation.drivingplatforms.wagons.commoditywag.HopperIndustrial;
import railwaystation.drivingplatforms.wagons.commoditywag.Refrigerator;
import railwaystation.drivingplatforms.wagons.commoditywag.TimberTrack;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.AmmoniaTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.GasTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.GasolineTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.OilTank;


public class CommodityWagonManager extends Manager {
    private ArrayList<Wagon> wagonsList = new ArrayList<Wagon>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private ArrayList<CommodityCargo> listCargo;
    private int countTypeWagonInBlocTrainl;
    private int countWagonInGroupOfWagons;
    private int totalCountWagonInBlocTrainl;
    private int totalCountPassengers;
    private int totalLengthOfWagons;

    public CommodityWagonManager(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;

        CommodityWagFactory comWagFactory = new CommodityWagFactory();
        for (int i = 0; i < listCargo.size(); i++) {
            int volumeCargo = listCargo.get(i).getVolumeOfCargo();
            while (volumeCargo > 0) {
                wagonsList.add(comWagFactory.genWagonCommodityCargo(listCargo.get(i)));
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
    }
    @Override
    public String toString() {
        String s =
            String.format("|%25s|%18s|%15s|%15s|\n", "Type of Cargo", "Type of Wagon", "Count of wagons", "Total Length",
                          "Count of Cargo");
        for (GroupOfWagons group : groupOfWagons) {
            s =
    s + String.format("|%25s|%18s|%15d|%15d|\n", group.getTypeCargo(), group.getTypeWagon(), group.getCountWagons(),
                    group.getTotalLength());
            totalLengthOfWagons = totalLengthOfWagons + group.getTotalLength();
        }
        s =
    s + String.format("|%44s|%15d|%15d|\n", "TOTAL PARAMETERS: ", totalCountWagonInBlocTrainl, totalLengthOfWagons);
        return s;
    }


    public void printWagonList(ArrayList<CommodityCargo> listCargo) {
        System.out.println(String.format("|%13s|%18s|%15s|%12s|%12s|%18s|%17s|%17s|", "Type of Cargo", "Type Of Wagon",
                                         "Weight of wagon", "Count of wagons", "Total length", "Weight all wagons",
                                         "Weight of Cargo", "Total Weight"));
        for (int i = 0; i < groupOfWagons.size(); i++) {
            System.out.println(String.format("|%13s|%18s|%11d ton|%15d|%10d m|%14d ton|%13d ton|%13d ton|",
                                             groupOfWagons.get(i).getTypeCargo(), groupOfWagons.get(i).getTypeWagon(),
                                             groupOfWagons.get(i).getWeightWagon(),
                                             groupOfWagons.get(i).getCountWagons(),
                                             groupOfWagons.get(i).getTotalLength(),
                                             groupOfWagons.get(i).getTotalWeight(),
                                             listCargo.get(i).getWeightOfCargo(),
                                             groupOfWagons.get(i).getTotalWeight() +
                                             listCargo.get(i).getWeightOfCargo()));
        }
        //        System.out.println(String.format("|%48s|%15d|%10d m|%14d ton|%13d ton|%13d ton|", "TOTAL PARAMETERS",
        //                                         countWagonInBlocTrainl, totalLengthWagons, totalWeightWagons,
        //                                         totalWeightCargo, totalWeightWagons + totalWeightCargo));
    }


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
}
