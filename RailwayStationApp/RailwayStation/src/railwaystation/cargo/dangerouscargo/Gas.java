package railwaystation.cargo.dangerouscargo;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Gaseus;

public class Gas extends Cargo implements Gaseus, Dangerous {

    @Override
    public void gaseus() {
    }

    @Override
    public void dangerous() {
    }
}
