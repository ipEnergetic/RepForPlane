package railwaystation.administration;

import java.util.ArrayList;

import railwaystation.deliveries.CommodityDelivery;
import railwaystation.deliveries.PassDelivery;


import railwaystation.drivingplatforms.DrivingPlatform;
import railwaystation.drivingplatforms.blocktrains.CommodityBlocktrain;
import railwaystation.drivingplatforms.blocktrains.PassengerBlocktrain;
import railwaystation.drivingplatforms.wagons.Wagon;

public class Dispatcher {
    private ArrayList<CommodityDelivery> listCommodityDelivery = new ArrayList<CommodityDelivery>();
    private ArrayList<PassDelivery> listPassDelivery = new ArrayList<PassDelivery>();
    private ArrayList<CommodityBlocktrain> listCommodityBlockTrain = new ArrayList<CommodityBlocktrain>();
    private ArrayList<PassengerBlocktrain> listPassBlockTrain = new ArrayList<PassengerBlocktrain>();

    public void createCommodityBlocktrain(CommodityDelivery commodityDelivery) {
        this.listCommodityDelivery.add(commodityDelivery);
        this.listCommodityBlockTrain.add(new CommodityBlocktrain(commodityDelivery));
    }

    public void createPassBlocktrain(PassDelivery passDeivery) {
        this.listPassDelivery.add(passDeivery);
        this.listPassBlockTrain.add(new PassengerBlocktrain(passDeivery));
    }

    public void printCommodityBlockTrainAndDelivery(int numberOfCommodityDelivery) {
        numberOfCommodityDelivery = numberOfCommodityDelivery - 1;
        if (listCommodityBlockTrain.size() > numberOfCommodityDelivery) {
            System.out.println(listCommodityDelivery.get(numberOfCommodityDelivery));
            System.out.println(listCommodityBlockTrain.get(numberOfCommodityDelivery));
        } else {
            System.out.println("Такого номера товарной поставки еще не было");
        }
    }

    public void printPassBlockTrainAndDelivery(int numberOfPassDelivery) {
        numberOfPassDelivery = numberOfPassDelivery - 1;
        if (listPassBlockTrain.size() > numberOfPassDelivery) {
            System.out.println(listPassDelivery.get(numberOfPassDelivery));
            System.out.println(listPassBlockTrain.get(numberOfPassDelivery));
        } else {
            System.out.println("Такого номера пассажирской поставки еще не было");
        }
    }

    public boolean connectBlockTrain(ArrayList<DrivingPlatform> blockTrain) {
        int i = 1;
        int countConnect = 0;
        while (blockTrain.get(i - 1).connect(blockTrain.get(i))) {
            i++;
            countConnect++;
            if (i == blockTrain.size()) {
                break;
            }
        }
        if (countConnect == (blockTrain.size() - 1)) {
        System.out.println("Cцепка состава прошла успешно");
            return true;
        } else {
            System.out.println("Не удалось сцеить состав");
            return false;
        }
    }
    
    public void shippedWagons (ArrayList<Wagon> listWagon){
        for (Wagon wag : listWagon){
            wag.getShipWagon();
        }
    }


    public void setListCommodityBlockTrain(ArrayList<CommodityBlocktrain> listCommodityBlockTrain) {
        this.listCommodityBlockTrain = listCommodityBlockTrain;
    }

    public ArrayList<CommodityBlocktrain> getListCommodityBlockTrain() {
        return listCommodityBlockTrain;
    }

    public void setListPassengerBlockTrain(ArrayList<PassengerBlocktrain> listPassengerBlockTrain) {
        this.listPassBlockTrain = listPassengerBlockTrain;
    }

    public ArrayList<PassengerBlocktrain> getListPassengerBlockTrain() {
        return listPassBlockTrain;
    }

    public void setListCommodityDelivery(ArrayList<CommodityDelivery> listCommodityDelivery) {
        this.listCommodityDelivery = listCommodityDelivery;
    }

    public ArrayList<CommodityDelivery> getListCommodityDelivery() {
        return listCommodityDelivery;
    }

    public void setListPassDelivery(ArrayList<PassDelivery> listPassDelivery) {
        this.listPassDelivery = listPassDelivery;
    }

    public ArrayList<PassDelivery> getListPassDelivery() {
        return listPassDelivery;
    }
}

