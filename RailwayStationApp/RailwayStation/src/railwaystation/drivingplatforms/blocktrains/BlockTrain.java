package railwaystation.drivingplatforms.blocktrains;

import java.util.ArrayList;

public class BlockTrain {
    private String typeOfFuel;
    private String typeOfRegionFollowing;
    private String typeSpeedOfFollowing;
    private String pointOfDestination;
    private double LengthOfBlockTrain;
    private double maxLengthOfBlockTrain;
    private double weightOfBlockTrain;
    private double maxWeightOfBlockTrain;
    ArrayList<BlockTrain> listBlockTrain;


    public void setTypeOfTransportation(String typeOfTransportation) {
        this.typeOfFuel = typeOfTransportation;
    }

    public String getTypeOfTransportation() {
        return typeOfFuel;
    }

    public void setTypeOfRegionFollowing(String typeOfRegionFollowing) {
        this.typeOfRegionFollowing = typeOfRegionFollowing;
    }

    public String getTypeOfRegionFollowing() {
        return typeOfRegionFollowing;
    }

    public void setTypeSpeedOfFollowing(String typeSpeedOfFollowing) {
        this.typeSpeedOfFollowing = typeSpeedOfFollowing;
    }

    public String getTypeSpeedOfFollowing() {
        return typeSpeedOfFollowing;
    }

    public void setPointOfDestination(String pointOfDestination) {
        this.pointOfDestination = pointOfDestination;
    }

    public String getPointOfDestination() {
        return pointOfDestination;
    }

    public void setLengthOfBlockTrain(double LengthOfBlockTrain) {
        this.LengthOfBlockTrain = LengthOfBlockTrain;
    }

    public double getLengthOfBlockTrain() {
        return LengthOfBlockTrain;
    }

    public void setMaxLengthOfBlockTrain(double maxLengthOfBlockTrain) {
        this.maxLengthOfBlockTrain = maxLengthOfBlockTrain;
    }

    public double getMaxLengthOfBlockTrain() {
        return maxLengthOfBlockTrain;
    }

    public void setWeightOfBlockTrain(double weightOfBlockTrain) {
        this.weightOfBlockTrain = weightOfBlockTrain;
    }

    public double getWeightOfBlockTrain() {
        return weightOfBlockTrain;
    }

    public void setMaxWeightOfBlockTrain(double maxWeightOfBlockTrain) {
        this.maxWeightOfBlockTrain = maxWeightOfBlockTrain;
    }

    public double getMaxWeightOfBlockTrain() {
        return maxWeightOfBlockTrain;
    }

    public void setListBlockTrain(ArrayList<BlockTrain> listBlockTrain) {
        this.listBlockTrain = listBlockTrain;
    }

    public ArrayList<BlockTrain> getListBlockTrain() {
        return listBlockTrain;
    }
}
