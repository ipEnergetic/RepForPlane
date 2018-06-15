package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.managers.factories.PassWagFactory;

import railwaystation.cargo.Passenger;

import railwaystation.cargo.interfacescondition.Buisness;
import railwaystation.cargo.interfacescondition.Common;
import railwaystation.cargo.interfacescondition.Plackart;
import railwaystation.cargo.interfacescondition.Sleeping;
import railwaystation.cargo.passengers.BuisnesPass;

import railwaystation.cargo.passengers.CommonPass;

import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;
import railwaystation.drivingplatforms.wagons.passengerwag.BuisnessWag;
import railwaystation.drivingplatforms.wagons.passengerwag.CommonWag;
import railwaystation.drivingplatforms.wagons.passengerwag.PlackartWag;
import railwaystation.drivingplatforms.wagons.passengerwag.SleeppingWag;

public class PassWagonManager extends Manager {
    private ArrayList<Wagon> wagonsList = new ArrayList<Wagon>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private int countTypeWagonInBlocTrainl;
    private int countWagonInGroupOfWagons;
    private int totalCountWagonInBlocTrainl;
    private int totalCountPassengers;
    private int totalLengthOfWagons;


    public PassWagonManager(ArrayList<ArrayList<Passenger>> listPassangers) {
        for (ArrayList<Passenger> listPass : listPassangers) {
            totalCountPassengers = totalCountPassengers + listPass.size();
        }


        PassWagFactory passWagFactory = new PassWagFactory();
        for (int i = 0; i < listPassangers.size(); i++) {
            int countPass = listPassangers.get(i).size();
            while (countPass > 0) {
                wagonsList.add(passWagFactory.genWagonPass(listPassangers.get(i).get(0)));
                countPass = countPass - wagonsList.get(wagonsList.size() - 1).getCapacity();
                countWagonInGroupOfWagons = countWagonInGroupOfWagons + 1;
                totalCountWagonInBlocTrainl = totalCountWagonInBlocTrainl + 1;
            }
            countTypeWagonInBlocTrainl = countTypeWagonInBlocTrainl + 1;
            groupOfWagons.add(new GroupOfWagons(listPassangers.get(i).get(0).getTypeOfPass(),
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
            String.format("|%25s|%18s|%15s|%15s|\n", "Type of Passengers", "Type of Wagon", "Count of wagons", "Total Length",
                          "Count of Passengers");
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
}
