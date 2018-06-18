package railwaystation.drivingplatforms;

import railwaystation.drivingplatforms.drivinginterfaces.Connect;

public abstract class DrivingPlatform implements Connect {
    public boolean connect(DrivingPlatform drivingPlatform) {
        if (this instanceof Connect) {
            return true;
        }
        System.out.println(this + "не может присоединиться к " + drivingPlatform);
        return false;
    }
}
