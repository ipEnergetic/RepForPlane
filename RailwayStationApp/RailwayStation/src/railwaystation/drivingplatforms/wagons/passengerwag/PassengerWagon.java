package railwaystation.drivingplatforms.wagons.passengerwag;

import railwaystation.drivingplatforms.wagons.Wagon;

public class PassengerWagon extends Wagon {
    private int countSittingPlace;
    private int countLyingPlace;

    @Override
    public void getShipWagon() {
    }

    public void setCountSittingPlace(int countSittingPlace) {
        this.countSittingPlace = countSittingPlace;
    }

    public int getCountSittingPlace() {
        return countSittingPlace;
    }

    public void setCountLyingPlace(int countLyingPlace) {
        this.countLyingPlace = countLyingPlace;
    }

    public int getCountLyingPlace() {
        return countLyingPlace;
    }
}


