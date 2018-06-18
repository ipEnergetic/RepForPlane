package railwaystation.administration.managers.factories;

import railwaystation.deliveries.cargo.CommodityCargo;
import railwaystation.deliveries.cargo.interfacescondition.Bulk;
import railwaystation.deliveries.cargo.interfacescondition.Dangerous;
import railwaystation.deliveries.cargo.interfacescondition.Food;
import railwaystation.deliveries.cargo.interfacescondition.IndustrialCargo;
import railwaystation.deliveries.cargo.interfacescondition.Packed;
import railwaystation.deliveries.cargo.dangerouscargo.Ammonia;
import railwaystation.deliveries.cargo.dangerouscargo.Gas;
import railwaystation.deliveries.cargo.dangerouscargo.Gasoline;
import railwaystation.deliveries.cargo.dangerouscargo.Oil;
import railwaystation.deliveries.cargo.food.Meat;
import railwaystation.deliveries.cargo.food.WheatFlow;
import railwaystation.deliveries.cargo.industrialcargo.Wood;
import railwaystation.drivingplatforms.wagons.Wagon;
import railwaystation.drivingplatforms.wagons.commoditywag.CoveredWagon;
import railwaystation.drivingplatforms.wagons.commoditywag.HopperFood;
import railwaystation.drivingplatforms.wagons.commoditywag.HopperIndustrial;
import railwaystation.drivingplatforms.wagons.commoditywag.Refrigerator;
import railwaystation.drivingplatforms.wagons.commoditywag.TimberTrack;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.AmmoniaTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.GasTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.GasolineTank;
import railwaystation.drivingplatforms.wagons.commoditywag.tank.OilTank;

public class CommodityWagFactory {

    public Wagon genWagonCommodityCargo(CommodityCargo cargo, int restOfCargo) {
        if (cargo instanceof Dangerous) {
            if (cargo instanceof Ammonia) {
                return new AmmoniaTank(80, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof Gas) {
                return new GasTank(80, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof Gasoline) {
                return new GasolineTank(80, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof Oil) {
                return new OilTank(80,cargo.getTypeOfCargo(), restOfCargo);
            } else {
                System.out.println("Такого вида: " + cargo.toString() + " опасного груза нет");
                return null;
            }
        } else if (cargo instanceof Food) {
            if (cargo instanceof Meat) {
                return new Refrigerator(20, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof Packed) {
                return new CoveredWagon(40, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof WheatFlow) {
                return new HopperFood(70, cargo.getTypeOfCargo(), restOfCargo);
            } else {
                System.out.println("Такого вида: " + cargo.toString() + " пищевого груза не существует");
                return null;
            }
        } else if (cargo instanceof IndustrialCargo) {
            if (cargo instanceof Bulk) {
                return new HopperIndustrial(60, cargo.getTypeOfCargo(), restOfCargo);
            } else if (cargo instanceof Wood) {
                return new TimberTrack(60, cargo.getTypeOfCargo(), restOfCargo);
            } else {
                System.out.println("Такого вида: " + cargo.toString() + " промышленного груза нет");
                return null;
            }
        } else {
            System.out.println("Такого вида: " + cargo.toString() + " груза нет");
            return null;
        }
    }
}
