package railwaystation.cargo.passengers;

import railwaystation.cargo.Passenger;
import railwaystation.cargo.interfacescondition.Plackart;

public class PlackartPass  extends Passenger implements Plackart{
    public PlackartPass() {
        this.setTypeOfPass("Passenger of Plackart");
        this.setAge((int)(Math.random() * 70));
        int countRandSex = (int)(1 + Math.random() * 2);
        if (countRandSex == 1)
            this.setSex("man");
        else
            this.setSex("woman");
    }
}
