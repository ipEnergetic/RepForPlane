package railwaystation.drivingplatforms.blocktrains;

import java.util.ArrayList;

import railwaystation.drivingplatforms.DrivingPlatform;

public class BlockTrain extends DrivingPlatform{
    private String typeOfFuel;
    private String typeOfRegionFollowing;
    private String pointOfDestination;
    private int LengthOfBlockTrain;
    private int weightOfBlockTrain;
    private ArrayList<DrivingPlatform> listBlockTrain;

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfRegionFollowing(String typeOfRegionFollowing) {
        this.typeOfRegionFollowing = typeOfRegionFollowing;
    }

    public String getTypeOfRegionFollowing() {
        return typeOfRegionFollowing;
    }

    public void setPointOfDestination(String pointOfDestination) {
        this.pointOfDestination = pointOfDestination;
    }

    public String getPointOfDestination() {
        return pointOfDestination;
    }

    public void setLengthOfBlockTrain(int LengthOfBlockTrain) {
        this.LengthOfBlockTrain = LengthOfBlockTrain;
    }

    public int getLengthOfBlockTrain() {
        return LengthOfBlockTrain;
    }

    public void setWeightOfBlockTrain(int weightOfBlockTrain) {
        this.weightOfBlockTrain = weightOfBlockTrain;
    }

    public int getWeightOfBlockTrain() {
        return weightOfBlockTrain;
    }

    public void setListBlockTrain(ArrayList<DrivingPlatform> listBlockTrain) {
        this.listBlockTrain = listBlockTrain;
    }

    public ArrayList<DrivingPlatform> getListBlockTrain() {
        return listBlockTrain;
    }
}
