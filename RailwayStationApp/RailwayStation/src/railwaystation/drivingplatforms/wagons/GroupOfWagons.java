package railwaystation.drivingplatforms.wagons;

public class GroupOfWagons extends Wagon {
    private String typeCargo;
    private int countWagons;
    private int totalLength;
    private int totalWeight;

    public GroupOfWagons(String typeCargo, String typeWagon, int lengthWagon, int weightWagon, int countWagons) {
        this.setTypeCargo(typeCargo);
        this.setTypeWagon(typeWagon);
        this.setLengthWagon(lengthWagon);
        this.setWeightWagon(weightWagon);
        this.setCountWagons(countWagons);
        this.setTotalLength(countWagons * lengthWagon);
        this.setTotalWeight(countWagons * weightWagon);
    }

    @Override
    public void getShipWagon() {
    }


    public void setTypeCargo(String typeCargo) {
        this.typeCargo = typeCargo;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
