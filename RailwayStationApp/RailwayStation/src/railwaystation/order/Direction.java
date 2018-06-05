package railwaystation.order;

import java.util.HashMap;
import java.util.Map;

public class Direction { //Направление
    private String cityOfDilivery;
    private double distance;
    private boolean isElectricity;

    static {
        Map<String, Boolean> listOfElectricity = new HashMap<String, Boolean>();
        listOfElectricity.put("Brest", true);
        listOfElectricity.put("Grodno", false);
        listOfElectricity.put("Vitebsk", true);
        listOfElectricity.put("Mogilev", false);
        listOfElectricity.put("Gomel", true);

        Map<String, Integer> listOfDistance = new HashMap<String, Integer>();
        listOfDistance.put("Brest", 348);
        listOfDistance.put("Grodno", 278);
        listOfDistance.put("Vitebsk", 290);
        listOfDistance.put("Mogilev", 198);
        listOfDistance.put("Gomel", 313);
    }
    
    public Direction (String sityOfDirection){
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
