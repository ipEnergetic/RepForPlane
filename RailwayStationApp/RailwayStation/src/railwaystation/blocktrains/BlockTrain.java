package railwaystation.blocktrains;

import java.util.ArrayList;

import railwaystation.order.OrderForTransportation;

public class BlockTrain {
    private int maxLengthOfBlockTrains;
    ArrayList<BlockTrain> listBlockTrains;
    ArrayList<OrderForTransportation> listOrderForBlocktrain;


    public BlockTrain(int maxLengthOfBlockTrains, ArrayList<OrderForTransportation> listOrderForBlocktrain) {
        this.maxLengthOfBlockTrains = maxLengthOfBlockTrains;
        this.listOrderForBlocktrain = new ArrayList<OrderForTransportation>();
        this.listOrderForBlocktrain.addAll(listOrderForBlocktrain);
    }

    public void setMaxLengthOfBlockTrains(int maxLengthOfBlockTrains) {
        this.maxLengthOfBlockTrains = maxLengthOfBlockTrains;
    }

    public int getMaxLengthOfBlockTrains() {
        return maxLengthOfBlockTrains;
    }
}
