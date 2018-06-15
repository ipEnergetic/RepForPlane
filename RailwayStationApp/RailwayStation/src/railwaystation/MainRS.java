package railwaystation;

import railwaystation.administration.Dispatcher;
import railwaystation.administration.managers.BlockTrainManager;
import railwaystation.administration.managers.CommodityWagonManager;
import railwaystation.administration.managers.CargoManager;
import railwaystation.administration.managers.LocoManager;
import railwaystation.administration.managers.PassManager;

import railwaystation.administration.managers.PassWagonManager;

import railwaystation.drivingplatforms.locomotives.electro.ElectroLoco;
import railwaystation.drivingplatforms.locomotives.electro.LocoEl3000;

public class MainRS {
    public static void main(String[] args) {

        Dispatcher dispatcher1 = new Dispatcher();
        dispatcher1.createPassengerBlockTrain();
//        dispatcher1.createCommodityBlockTrain();

    }
}
