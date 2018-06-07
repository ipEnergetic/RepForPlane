package railwaystation.cargo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import railwaystation.cargo.dangerouscargo.Ammonia;


public class CargoManager extends Cargo {
    public ArrayList<Cargo> listCargo = new ArrayList<Cargo>();

    public void genTypeCargo() {
        int randNumCargo = (int)(1 + Math.random() * 9);

        switch (1) {
        case 1:
            System.out.println("Ammonia");
            listCargo.add(new Ammonia());
            break;
        case 2:
            System.out.println("Gas");
            break;
        case 3:
            System.out.println("Gasoline");
            break;
        case 4:
            System.out.println("Oil");
            break;
        case 5:
            System.out.println("Animals");
            break;
        case 6:
            System.out.println("Meat");
            break;
        case 7:
            System.out.println("Coal");
            break;
        case 8:
            System.out.println("Wood");
            break;
        case 9:
            System.out.println("Macadam");
            break;
        case 10:
            System.out.println("Sand");
            break;
        }
    }
}


