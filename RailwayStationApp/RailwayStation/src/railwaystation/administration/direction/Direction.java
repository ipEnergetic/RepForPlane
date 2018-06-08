package railwaystation.administration.direction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Direction { //Направление

    private String cityOfDilivery;
    private double distance;
    private boolean isElectricity;

    public static ArrayList<Direction> listDirections;

    static {
        listDirections = new ArrayList<Direction>();
        listDirections.add(new ElectricityDirection("Brest", 348, true));
        listDirections.add(new DieselDirection("Grodno", 278, false));
        listDirections.add(new ElectricityDirection("Vitebsk", 290, true));
        listDirections.add(new DieselDirection("Mogilev", 198, false));
        listDirections.add(new ElectricityDirection("Gomel", 313, true));
        listDirections.add(new ElectricityDirection("Moskov", 675, true));
        listDirections.add(new DieselDirection("Pinsk", 133, false));
        listDirections.add(new ElectricityDirection("Molodechno", 65, true));
        listDirections.add(new ElectricityDirection("Orsha", 197, true));
        listDirections.add(new ElectricityDirection("Warshava", 475, true));
    }

    public void setCityOfDilivery(String cityOfDilivery) {
        this.cityOfDilivery = cityOfDilivery;
    }

    public String getCityOfDilivery() {
        return cityOfDilivery;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setIsElectricity(boolean isElectricity) {
        this.isElectricity = isElectricity;
    }

    public boolean isIsElectricity() {
        return isElectricity;
    }
}
