package railwaystation.blocktrains;


public class PassengerBlocktrain extends BlockTrain{
    private int CountSittingPlace;
    private int CountLyingPlace;
    private boolean isRestaurant;
    private boolean isMailWagon;

    public void setCountSittingPlace(int CountSittingPlace) {
        this.CountSittingPlace = CountSittingPlace;
    }

    public int getCountSittingPlace() {
        return CountSittingPlace;
    }

    public void setCountLyingPlace(int CountLyingPlace) {
        this.CountLyingPlace = CountLyingPlace;
    }

    public int getCountLyingPlace() {
        return CountLyingPlace;
    }

    public void setIsRestaurant(boolean isRestaurant) {
        this.isRestaurant = isRestaurant;
    }

    public boolean isIsRestaurant() {
        return isRestaurant;
    }

    public void setIsMailWagon(boolean isMailWagon) {
        this.isMailWagon = isMailWagon;
    }

    public boolean isIsMailWagon() {
        return isMailWagon;
    }
}
