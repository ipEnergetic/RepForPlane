package railwaystation;

import railwaystation.administration.managers.BlockTrainManager;
import railwaystation.administration.managers.WagonsManager;
import railwaystation.administration.managers.CargoManager;
import railwaystation.administration.managers.LocoManager;
import railwaystation.administration.managers.Manager;
import railwaystation.administration.managers.PassengerManager;

import railwaystation.drivingplatforms.locomotives.electro.ElectroLoco;
import railwaystation.drivingplatforms.locomotives.electro.LocoEl3000;

public class MainRS {
    public static void main(String[] args) {
        CargoManager manager1 = new CargoManager();
        PassengerManager manager2 = new PassengerManager();
        WagonsManager manager3 = new WagonsManager(manager1.getListCargo());
        LocoManager manager4 =
            new LocoManager(manager3.getGroupOfWagons(), manager1.getDirectionOfDelivery(), manager3.getTotalWeightCargo(),
                            manager3.getTotalWeightWagons());
        BlockTrainManager manager5 =
            new BlockTrainManager(manager4.getListLoco(), manager3.getWagonsList(), manager3.getGroupOfWagons(),
                                  manager1.getListCargo(), manager1.getDirectionOfDelivery());

        System.out.println(manager5.toString());
    }
}
