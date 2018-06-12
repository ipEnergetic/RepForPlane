package railwaystation.administration.managers;

import java.util.ArrayList;

import java.util.Arrays;

import railwaystation.administration.direction.Direction;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.condition.Bulk;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Food;
import railwaystation.cargo.condition.IndustrialCargo;
import railwaystation.cargo.condition.Packed;
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
import railwaystation.drivingplatforms.wagons.commodity.CoveredWagon;
import railwaystation.drivingplatforms.wagons.commodity.HopperFood;
import railwaystation.drivingplatforms.wagons.commodity.HopperIndustrial;
import railwaystation.drivingplatforms.wagons.commodity.Refrigerator;
import railwaystation.drivingplatforms.wagons.commodity.TimberTrack;
import railwaystation.drivingplatforms.wagons.commodity.tank.AmmoniaTank;
import railwaystation.drivingplatforms.wagons.commodity.tank.GasTank;
import railwaystation.drivingplatforms.wagons.commodity.tank.GasolineTank;
import railwaystation.drivingplatforms.wagons.commodity.tank.OilTank;


public class WagonsManager extends Manager {
    private ArrayList<Wagon> wagonsList = new ArrayList<Wagon>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private ArrayList<CommodityCargo> listCargo;
    private int totalLengthWagons;
    private int totalWeightWagons;
    private int totalWeightCargo;
    private static int countTypeWagonInBlocTrainl = 0;
    private static int countWagonInBlocTrainl = 0;

    public WagonsManager(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;
        genWagonOfBlockTrain(listCargo);
        initTotalParam();
    }

    public void genWagonOfBlockTrain(ArrayList<CommodityCargo> listCargo) {
        for (int i = 0; i < listCargo.size(); i++) {
            if (listCargo.get(i) instanceof Dangerous) {
                if (listCargo.get(i) instanceof Ammonia) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new AmmoniaTank(80));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof Gas) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new GasTank(80));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof Gasoline) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new GasolineTank(80));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof Oil) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new OilTank(80));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else {
                    System.out.println("Такого вида опасного груза нет");
                }
            } else if (listCargo.get(i) instanceof Food) {
                if (listCargo.get(i) instanceof Meat) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new Refrigerator(20));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof Packed) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new CoveredWagon(40));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof WheatFlow) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new HopperFood(70));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else {
                    System.out.println("Такого вида пищевого груза нет");
                }
            } else if (listCargo.get(i) instanceof IndustrialCargo) {
                if (listCargo.get(i) instanceof Bulk) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new HopperIndustrial(60));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else if (listCargo.get(i) instanceof Wood) {
                    int coutCargo = listCargo.get(i).getVolumeOfCargo();
                    int j = 0;
                    while (coutCargo >= 0) {
                        wagonsList.add(new TimberTrack(60));
                        coutCargo = coutCargo - wagonsList.get(j).getValume();
                        j++;
                        countWagonInBlocTrainl++;
                    }
                    setParamWagonsInBlockTrain(listCargo.get(i).getTypeOfCargo(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getTypeWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getLengthWagon(),
                                               wagonsList.get(countWagonInBlocTrainl - 1).getWeightWagon(), j);
                } else {
                    System.out.println("Такого вида промышленного груза нет");
                }
            } else {
                System.out.println("Такого вида груза нет");
            }
        }
    }

    public void setParamWagonsInBlockTrain(String typeCargo, String typeWagon, int lengthWagon, int weightWagon,
                                           int countWagons) {
        GroupOfWagons group = new GroupOfWagons(typeCargo, typeWagon, lengthWagon, weightWagon, countWagons);
        groupOfWagons.add(group);
        countTypeWagonInBlocTrainl++;
    }

    public void initTotalParam() {
        totalLengthWagons = 0;
        totalWeightWagons = 0;
        totalWeightCargo = 0;
        for (int i = 0; i < groupOfWagons.size(); i++) {
            totalLengthWagons = totalLengthWagons + groupOfWagons.get(i).getTotalLength();
            totalWeightWagons = totalWeightWagons + groupOfWagons.get(i).getTotalWeight();
            totalWeightCargo = totalWeightCargo + listCargo.get(i).getWeightOfCargo();
        }
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
        System.out.println(String.format("|%48s|%15d|%10d m|%14d ton|%13d ton|%13d ton|", "TOTAL PARAMETERS",
                                         countWagonInBlocTrainl, totalLengthWagons, totalWeightWagons,
                                         totalWeightCargo, totalWeightWagons + totalWeightCargo));
    }

//    public void genLocoList(ArrayList<CommodityCargo> listCargo, Direction directionOfDelivery) {
//        if (directionOfDelivery.isIsElectricity()) {
//            Loco mainLoco = new ElectroLoco();
//        } else {
//            Loco mainLoco = new DieselLoco();
//        }
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

    public void setTotalWeightWagons(int totalWeightWagons) {
        this.totalWeightWagons = totalWeightWagons;
    }

    public int getTotalWeightWagons() {
        return totalWeightWagons;
    }

    public void setTotalWeightCargo(int totalWeightCargo) {
        this.totalWeightCargo = totalWeightCargo;
    }

    public int getTotalWeightCargo() {
        return totalWeightCargo;
    }

    public static void setCountWagonInBlocTrainl(int countWagonInBlocTrainl) {
        WagonsManager.countWagonInBlocTrainl = countWagonInBlocTrainl;
    }

    public static int getCountWagonInBlocTrainl() {
        return countWagonInBlocTrainl;
    }
}
