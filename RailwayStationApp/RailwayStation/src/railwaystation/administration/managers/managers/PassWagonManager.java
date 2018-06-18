package railwaystation.administration.managers.managers;

import java.util.ArrayList;

import railwaystation.administration.managers.factories.PassWagFactory;

import railwaystation.deliveries.cargo.Passenger;

import railwaystation.drivingplatforms.wagons.GroupOfWagons;
import railwaystation.drivingplatforms.wagons.Wagon;

public class PassWagonManager {
    private ArrayList<Wagon> wagonsList = new ArrayList<Wagon>();
    private ArrayList<GroupOfWagons> groupOfWagons = new ArrayList<GroupOfWagons>();
    private int totalWeightWagons;
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
        totalWeightWagons = totalWeightWagons(this.wagonsList);
    }

    private int totalWeightWagons(ArrayList<Wagon> listWagon) {
        int totalWeight = 0;
        for (Wagon wagon : listWagon) {
            totalWeight = totalWeight + wagon.getWeightWagon();
        }
        return totalWeight;
    }


    @Override
    public String toString() {
        String s =
            String.format("|%25s|%18s|%15s|%15s|\n", "Type of Passengers", "Type of Wagon", "Count of wagons", "Total Length",
                          "Count of Passengers");
        for (GroupOfWagons group : groupOfWagons) {
            s =
  s + String.format("|%25s|%18s|%15d|%15d|\n", group.getTypeCargo(), group.getTypeWagons(), group.getCountWagons(),
                    group.getTotalLength());
            totalLengthOfWagons = totalLengthOfWagons + group.getTotalLength();
        }
        s =
  s + String.format("|%44s|%15d|%15d|\n", "TOTAL PARAMETERS: ", totalCountWagonInBlocTrainl, totalLengthOfWagons);
        return s;
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

    public void setTotalCountPassengers(int totalCountPassengers) {
        this.totalCountPassengers = totalCountPassengers;
    }

    public int getTotalCountPassengers() {
        return totalCountPassengers;
    }

    public void setTotalLengthOfWagons(int totalLengthOfWagons) {
        this.totalLengthOfWagons = totalLengthOfWagons;
    }

    public int getTotalLengthOfWagons() {
        return totalLengthOfWagons;
    }

    public void setTotalWeightWagons(int totalWeightWagons) {
        this.totalWeightWagons = totalWeightWagons;
    }

    public int getTotalWeightWagons() {
        return totalWeightWagons;
    }
}
