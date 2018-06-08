package railwaystation;

import railwaystation.administration.managers.CargoManager;
import railwaystation.administration.managers.Manager;
import railwaystation.administration.managers.PassengerManager;

public class MainRS {
    public static void main(String[] args) {
        CargoManager manager1 = new CargoManager();
        PassengerManager manager2 = new PassengerManager();
        manager1.genDelivery();
        manager1.printDelivery();
        System.out.println();
        manager2.genDelivery();
        manager2.printDelivery();
    }
}
