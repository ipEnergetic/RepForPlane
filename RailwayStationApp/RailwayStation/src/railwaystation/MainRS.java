package railwaystation;

import railwaystation.administration.Dispatcher;

import railwaystation.deliveries.CommodityDelivery;
import railwaystation.deliveries.PassDelivery;


public class MainRS {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.createPassBlocktrain(new PassDelivery());
        dispatcher.createCommodityBlocktrain(new CommodityDelivery());
        dispatcher.printPassBlockTrainAndDelivery(1); 
        dispatcher.printCommodityBlockTrainAndDelivery(1);
        dispatcher.connectBlockTrain(dispatcher.getListCommodityBlockTrain().get(0).getListBlockTrain());
        System.out.println(dispatcher.getListCommodityBlockTrain().get(0).getListWagons().get(0).getFilledVolume());
        dispatcher.shippedWagons(dispatcher.getListCommodityBlockTrain().get(0).getListWagons());
        System.out.println(dispatcher.getListCommodityBlockTrain().get(0).getListWagons().get(0).getFilledVolume());

    }
}
