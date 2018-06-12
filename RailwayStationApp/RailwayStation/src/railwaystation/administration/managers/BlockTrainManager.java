package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.direction.Direction;

import railwaystation.cargo.Cargo;

import railwaystation.cargo.CommodityCargo;

import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.locomotives.Loco;
import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;

public class BlockTrainManager {
    private ArrayList<DrivingPlatform> blockTrainList;
    private ArrayList<Loco> listLoco;
    private ArrayList<Wagon> wagonsList;
    private ArrayList<GroupOfWagons> groupOfWagons;
    private ArrayList<CommodityCargo> listCargo;
    private Direction direction;
    private int totalWeightBlocktrain;
    private int totalWeightCargo;
    private int totalLengthBlocktrain;
    private int totalCountWagon;

    public BlockTrainManager(ArrayList<Loco> listLoco, ArrayList<Wagon> wagonsList,
                             ArrayList<GroupOfWagons> groupOfWagons, ArrayList<CommodityCargo> listCargo,
                             Direction direction) {
        blockTrainList = new ArrayList<DrivingPlatform>();
        this.listCargo = listCargo;
        this.listLoco = listLoco;
        this.direction = direction;
        this.wagonsList = wagonsList;
        this.groupOfWagons = groupOfWagons;
        this.totalCountWagon = wagonsList.size();
        for (int i = 0; i < listCargo.size(); i++) {
            totalWeightCargo = totalWeightCargo + listCargo.get(i).getWeightOfCargo();
        }
        blockTrainList.addAll(listLoco);
        blockTrainList.addAll(wagonsList);
        for (int i = 0; i < groupOfWagons.size(); i++) {
            totalLengthBlocktrain = totalLengthBlocktrain + groupOfWagons.get(i).getTotalLength();
            totalWeightBlocktrain = totalWeightBlocktrain + groupOfWagons.get(i).getTotalWeight();
        }
        for (int i = 0; i < listLoco.size(); i++) {
            totalLengthBlocktrain = totalLengthBlocktrain + listLoco.get(i).getLengthLoco();
            totalWeightBlocktrain = totalWeightBlocktrain + listLoco.get(i).getWeightLoco();
        }
    }

    @Override
    public String toString() {

        String s1 = String.format("|%25s|%14s|\n", "City of Delivery", direction.getCityOfDilivery());
        String s2 = String.format("|%25s|%14s|\n", "Distance of Delivery", direction.getDistance());
        String s3 = String.format("|%25s|%14s|\n", "Type of Main Locomotive", listLoco.get(0).getTypeLoco());
        //        System.out.println("GHJDTHRFFFFFFF + " + listLoco.size());
        String s31 = "";
        if (listLoco.size() == 2) {
            s31 = String.format("|%24s|%14s|\n", "Type of Second Locomotive", listLoco.get(1).getTypeLoco());
        }
        String s32 = "\n";
        String s4 =
            String.format("|%13s|%18s|%15s|%12s|%12s|%18s|%17s|%17s|\n", "Type of Cargo", "Type Of Wagon", "Weight of wagon",
                          "Count of wagons", "Total length", "Weight all wagons", "Weight of Cargo", "Total Weight");
        String s5 = "";
        for (int i = 0; i < groupOfWagons.size(); i++) {
            s5 =
 s5 + String.format("|%13s|%18s|%11d ton|%15d|%10d m|%14d ton|%13d ton|%13d ton|\n", groupOfWagons.get(i).getTypeCargo(),
                    groupOfWagons.get(i).getTypeWagon(), groupOfWagons.get(i).getWeightWagon(),
                    groupOfWagons.get(i).getCountWagons(), groupOfWagons.get(i).getTotalLength(),
                    groupOfWagons.get(i).getTotalWeight(), listCargo.get(i).getWeightOfCargo(),
                    groupOfWagons.get(i).getTotalWeight() + listCargo.get(i).getWeightOfCargo());
        }
        String s6 =
            String.format("|%48s|%15d|%10d m|%14d ton|%13d ton|%13d ton|", "TOTAL PARAMETERS", totalCountWagon, totalLengthBlocktrain,
                          totalWeightBlocktrain, totalWeightCargo, totalWeightBlocktrain + totalWeightCargo);
        String s = s1 + s2 + s3 + s31 + s32 + s4 + s5 + s6;
        return s;
    }

}
