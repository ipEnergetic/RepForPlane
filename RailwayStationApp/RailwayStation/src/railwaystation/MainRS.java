package railwaystation;

import railwaystation.cargo.CargoManager;
import railwaystation.cargo.dangerouscargo.Ammonia;

public class MainRS {
    public static void main(String[] args) {
        CargoManager manager = new CargoManager();
        manager.genTypeCargo();
        System.out.println(manager.listCargo.get(0).getTypeOfCargo());
        System.out.println(manager.listCargo.get(0).getCountOfCargo());
        System.out.println("Надо ли замораживать: " + manager.listCargo.get(0).isIsNeedToFreeze());
        System.out.println("Консистенция груза: " + manager.listCargo.get(0).getConditionOfCargo());
        System.out.println("Опасен ли груз: " + manager.listCargo.get(0).isIsDangerous());
    }
}
