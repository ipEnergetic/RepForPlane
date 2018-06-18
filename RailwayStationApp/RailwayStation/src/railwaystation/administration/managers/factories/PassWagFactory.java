package railwaystation.administration.managers.factories;

import java.util.ArrayList;

import railwaystation.deliveries.cargo.Passenger;
import railwaystation.deliveries.cargo.interfacescondition.Buisness;
import railwaystation.deliveries.cargo.interfacescondition.Common;
import railwaystation.deliveries.cargo.interfacescondition.Plackart;
import railwaystation.deliveries.cargo.interfacescondition.Sitting;
import railwaystation.deliveries.cargo.interfacescondition.Sleeping;

import railwaystation.drivingplatforms.wagons.Wagon;
import railwaystation.drivingplatforms.wagons.passengerwag.BuisnessWag;
import railwaystation.drivingplatforms.wagons.passengerwag.CommonWag;
import railwaystation.drivingplatforms.wagons.passengerwag.PlackartWag;
import railwaystation.drivingplatforms.wagons.passengerwag.SittingWag;


public class PassWagFactory {

    public Wagon genWagonPass(Passenger passenger) {
        if (passenger == null) {
            System.out.println("ОШИБКА! В переданновм списке нет пассажиров");
            return null;
        } else if (passenger instanceof Buisness) {
            return new BuisnessWag();
        } else if (passenger instanceof Plackart) {
            return new PlackartWag();
        } else if (passenger instanceof Sitting) {
            return new SittingWag();
        } else if (passenger instanceof Common) {
            return new CommonWag();
        }
        System.out.println("Нет вагонов для данного типа пассажиров");
        return null;
    }
}
