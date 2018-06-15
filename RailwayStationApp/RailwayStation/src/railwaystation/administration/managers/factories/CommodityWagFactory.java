package railwaystation.administration.managers.factories;

import com.sun.org.apache.bcel.internal.generic.CASTORE;

import railwaystation.cargo.CommodityCargo;
import railwaystation.cargo.interfacescondition.Bulk;
import railwaystation.cargo.interfacescondition.Dangerous;
import railwaystation.cargo.interfacescondition.Food;
import railwaystation.cargo.interfacescondition.IndustrialCargo;
import railwaystation.cargo.interfacescondition.Packed;
import railwaystation.cargo.dangerouscargo.Ammonia;

import railwaystation.cargo.dangerouscargo.Gas;

import railwaystation.cargo.dangerouscargo.Gasoline;

import railwaystation.cargo.dangerouscargo.Oil;

import railwaystation.cargo.food.Meat;

import railwaystation.cargo.food.WheatFlow;

import railwaystation.cargo.industrialcargo.Wood;

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

    public Wagon genWagonCommodityCargo(CommodityCargo cargo) {
        if (cargo instanceof Dangerous) {
            if (cargo instanceof Ammonia) {
                return new AmmoniaTank(80);
            } else if (cargo instanceof Gas) {
                return new GasTank(80);
            } else if (cargo instanceof Gasoline) {
                return new GasolineTank(80);
            } else if (cargo instanceof Oil) {
                return new OilTank(80);
            } else {
                System.out.println("Такого вида: " + cargo.toString() + " опасного груза нет");
                return null;
            }
        } else if (cargo instanceof Food) {
            if (cargo instanceof Meat) {
                return new Refrigerator(20);
            } else if (cargo instanceof Packed) {
                return new CoveredWagon(40);
            } else if (cargo instanceof WheatFlow) {
                return new HopperFood(70);
            } else {
                System.out.println("Такого вида: " + cargo.toString() + " пищевого груза не существует");
                return null;
            }
        } else if (cargo instanceof IndustrialCargo) {
            if (cargo instanceof Bulk) {
                return new HopperIndustrial(60);
            } else if (cargo instanceof Wood) {
                return new TimberTrack(60);
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
