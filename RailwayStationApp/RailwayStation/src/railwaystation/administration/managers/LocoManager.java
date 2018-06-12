package railwaystation.administration.managers;

import java.util.ArrayList;

import railwaystation.administration.direction.Direction;

import railwaystation.drivingplatforms.locomotives.Loco;
import railwaystation.drivingplatforms.locomotives.diesel.LocoD3000;
import railwaystation.drivingplatforms.locomotives.diesel.LocoD5000;
import railwaystation.drivingplatforms.locomotives.diesel.LocoD7000;
import railwaystation.drivingplatforms.locomotives.electro.LocoEl3000;
import railwaystation.drivingplatforms.locomotives.electro.LocoEl5000;
import railwaystation.drivingplatforms.locomotives.electro.LocoEl7000;
import railwaystation.drivingplatforms.wagons.GroupOfWagons;

public class LocoManager extends Manager {
    ArrayList<Loco> listLoco = new ArrayList<Loco>();


    public LocoManager (ArrayList<GroupOfWagons> list, Direction direction, int totalWeightWagons,
                        int totalWeightCargo){
        genLoco(list, direction, totalWeightWagons, totalWeightCargo);
    }

    public void genLoco(ArrayList<GroupOfWagons> list, Direction direction, int totalWeightWagons,
                        int totalWeightCargo) {
        int totalWeight = totalWeightCargo + totalWeightWagons;
        if (direction.isIsElectricity()) {
            createElLoco(totalWeight);
        } else {
            createDieselLoco(totalWeight);
        }
    }

    public void createElLoco(int totalWeight) {
        int maxCountLoco = 0;
        while (totalWeight > 0) {
            if (totalWeight <= 3000) {
                listLoco.add(new LocoEl3000());
                totalWeight = totalWeight - 3000;
            } else if (totalWeight <= 5000) {
                listLoco.add(new LocoEl5000());
                totalWeight = totalWeight - 5000;
            } else {
                listLoco.add(new LocoEl7000());
                totalWeight = totalWeight - 7000;
            }
        }
        if (maxCountLoco > 2) {
            System.out.println("Невозможно подобрать состав - груз слишком тяжелый");
            listLoco = null;
        }
    }

    public void createDieselLoco(int totalWeight) {
        int maxCountLoco = 0;
        while (totalWeight > 0) {
            if (totalWeight <= 3000) {
                listLoco.add(new LocoD3000());
                totalWeight = totalWeight - 3000;
            } else if (totalWeight <= 5000) {
                listLoco.add(new LocoD5000());
                totalWeight = totalWeight - 5000;
            } else {
                listLoco.add(new LocoD7000());
                totalWeight = totalWeight - 7000;
            }
        }
        if (maxCountLoco > 2) {
            System.out.println("Невозможно подобрать состав - груз слишком тяжелый");
            listLoco = null;
        }
    }

    public void setListLoco(ArrayList<Loco> listLoco) {
        this.listLoco = listLoco;
    }

    public ArrayList<Loco> getListLoco() {
        return listLoco;
    }
}
