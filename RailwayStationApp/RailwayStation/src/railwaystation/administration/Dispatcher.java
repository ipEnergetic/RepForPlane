package railwaystation.administration;

import railwaystation.administration.managers.BlockTrainManager;
import railwaystation.administration.managers.CargoManager;
import railwaystation.administration.managers.LocoManager;
import railwaystation.administration.managers.PassManager;
import railwaystation.administration.managers.PassWagonManager;
import railwaystation.administration.managers.CommodityWagonManager;

public class Dispatcher {

    public void createCommodityBlockTrain() {
        CargoManager manager1 = new CargoManager();
        CommodityWagonManager manager2 = new CommodityWagonManager(manager1.getListCargo());
        System.out.println(manager2.toString());
//        LocoManager manager4 =
//            new LocoManager(manager2.getGroupOfWagons(), manager1.getDirectionOfDelivery(), manager2.getTotalWeightCargo(),
//                            manager2.getTotalWeightWagons());
//        BlockTrainManager manager5 =
//            new BlockTrainManager(manager4.getListLoco(), manager2.getWagonsList(), manager2.getGroupOfWagons(),
//                                  manager1.getListCargo(), manager1.getDirectionOfDelivery());
//        System.out.println(manager5.toString());
    }

    public void createPassengerBlockTrain() {
        PassManager passManager1 = new PassManager();
        PassWagonManager passManager2 = new PassWagonManager(passManager1.getListPassangers());
        System.out.println(passManager2.toString());

    }
}
