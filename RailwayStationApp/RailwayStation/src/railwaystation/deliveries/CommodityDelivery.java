package railwaystation.deliveries;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.dangerouscargo.Ammonia;
import railwaystation.deliveries.cargo.dangerouscargo.Gas;
import railwaystation.deliveries.cargo.dangerouscargo.Gasoline;
import railwaystation.deliveries.cargo.dangerouscargo.Oil;
import railwaystation.deliveries.cargo.food.Meat;
import railwaystation.deliveries.cargo.food.WheatFlow;
import railwaystation.deliveries.cargo.food.WheatPacked;
import railwaystation.deliveries.cargo.industrialcargo.Coal;
import railwaystation.deliveries.cargo.industrialcargo.Macadam;
import railwaystation.deliveries.cargo.industrialcargo.Sand;
import railwaystation.deliveries.cargo.industrialcargo.Wood;
import railwaystation.deliveries.directions.Direction;

public class CommodityDelivery extends Delivery {
    private ArrayList<CommodityCargo> listCargo = new ArrayList<CommodityCargo>();
    private int totalWeightCargo;

    public CommodityDelivery() {
        this.setDirectionOfDelivery(genDirection());
        this.listCargo = genTypeCargo();
        this.totalWeightCargo = totalWeightCargo(this.listCargo);
    }

    public ArrayList<CommodityCargo> genTypeCargo() {
        ArrayList<CommodityCargo> cargo = new ArrayList<CommodityCargo>();
        Set setRepeat = new HashSet();
        int randCountTypeCargo = (int)(4 + Math.random() * 3);
        for (int i = 0; i < randCountTypeCargo; i++) {
            int randTypeCargo = (int)(1 + Math.random() * 10);
            if (setRepeat.contains(randTypeCargo)) {
                i = i - 1;
                continue;
            }
            setRepeat.add(randTypeCargo);
            switch (randTypeCargo) {
            case 1:
                this.listCargo.add(new Ammonia());
                break;
            case 2:
                this.listCargo.add(new Gas());
                break;
            case 3:
                this.listCargo.add(new Gasoline());
                break;
            case 4:
                this.listCargo.add(new Oil());
                break;
            case 5:
                this.listCargo.add(new Meat());
                break;
            case 6:
                this.listCargo.add(new Coal());
                break;
            case 7:
                this.listCargo.add(new Wood());
                break;
            case 8:
                this.listCargo.add(new Macadam());
                break;
            case 9:
                this.listCargo.add(new Sand());
                break;
            case 10:
                this.listCargo.add(new WheatPacked());
                break;
            case 11:
                this.listCargo.add(new WheatFlow());
                break;
            }
        }
        return this.listCargo;
    }

    public int totalWeightCargo(ArrayList<CommodityCargo> listCargo) {
        int totalWeightCargo = 0;
        for (CommodityCargo cargo : listCargo) {
            totalWeightCargo = totalWeightCargo + cargo.getWeightOfCargo();
        }
        return totalWeightCargo;
    }

    public Direction genDirection() {
        int randDirection = (int)(Math.random() * Direction.listDirections.size());
        return Direction.listDirections.get(randDirection);
    }

    @Override
    public String toString() {
        String s1 =
            String.format("|%18s|%22s|%25s|\n", "City of delivery", "Distance of delivery", "Is direction electricity");
        s1 =
 s1 + String.format("|%18s|%19s km|%25s|\n", getDirectionOfDelivery().getCityOfDilivery(), getDirectionOfDelivery().getDistance(),
                    getDirectionOfDelivery().isIsElectricity());
        String s2 = String.format("|%14s|%16s|%17s|\n", "Name of Cargo", "Value of Cargo", "Weight of Cargo");
        for (int i = 0; i < listCargo.size(); i++) {
            s2 =
 s2 + String.format("|%14s|%13d m3|%13d ton|\n", listCargo.get(i).getTypeOfCargo(), listCargo.get(i).getVolumeOfCargo(),
                    listCargo.get(i).getWeightOfCargo());
        }
        return s1 + s2;
    }

    public void setListCargo(ArrayList<CommodityCargo> listCargo) {
        this.listCargo = listCargo;
    }

    public ArrayList<CommodityCargo> getListCargo() {
        return listCargo;
    }

    public void setTotalWeightCargo(int totalWeightCargo) {
        this.totalWeightCargo = totalWeightCargo;
    }

    public int getTotalWeightCargo() {
        return totalWeightCargo;
    }
}
