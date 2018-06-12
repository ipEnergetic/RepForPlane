package railwaystation;

import java.util.ArrayList;
import railwaystation.drivingplatforms.blocktrains.BlockTrain;
import railwaystation.drivingplatforms.locomotives.electro.ElectroLoco;
import railwaystation.drivingplatforms.locomotives.diesel.DieselLoco;
import railwaystation.drivingplatforms.wagons.Wagon;


public class RailwayStation {
    ArrayList<ElectroLoco> listElectroLoco;
    ArrayList<DieselLoco> listDieselLoco;
    ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    ArrayList<BlockTrain> listBlockTrains = new ArrayList<BlockTrain>();

    public void setListElectroLoco(ArrayList<ElectroLoco> listElectroLoco) {
        this.listElectroLoco = listElectroLoco;
    }

    public ArrayList<ElectroLoco> getListElectroLoco() {
        return listElectroLoco;
    }

    public void setListDieselLoco(ArrayList<DieselLoco> listDieselLoco) {
        this.listDieselLoco = listDieselLoco;
    }

    public ArrayList<DieselLoco> getListDieselLoco() {
        return listDieselLoco;
    }

    public void setListWagons(ArrayList<Wagon> listWagons) {
        this.listWagons = listWagons;
    }

    public ArrayList<Wagon> getListWagons() {
        return listWagons;
    }

    public void setListBlockTrains(ArrayList<BlockTrain> listBlockTrains) {
        this.listBlockTrains = listBlockTrains;
    }

    public ArrayList<BlockTrain> getListBlockTrains() {
        return listBlockTrains;
    }
}
