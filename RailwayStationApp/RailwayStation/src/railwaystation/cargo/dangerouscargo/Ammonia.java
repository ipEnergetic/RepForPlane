package railwaystation.cargo.dangerouscargo;

import railwaystation.cargo.Cargo;
import railwaystation.cargo.condition.Bulk;
import railwaystation.cargo.condition.Dangerous;
import railwaystation.cargo.condition.Flow;
import railwaystation.cargo.condition.Freeze;
import railwaystation.cargo.condition.Gaseus;
import railwaystation.cargo.condition.Packed;

public class Ammonia extends Cargo implements Gaseus, Dangerous {

    public Ammonia() {
        this.setTypeOfCargo("Ammonia");
        /*
         * Выбираем рандомно количество от 80м3 до 1600м3
         */
        this.setCountOfCargo((int)(80 + Math.random() * 1520));
        /*
         * Выясняем параметры груза и вносим значения
         */
        this.initConditionOfCargo();
    }

    @Override
    public void gaseus() {
    }

    @Override
    public void dangerous() {
    }
}
