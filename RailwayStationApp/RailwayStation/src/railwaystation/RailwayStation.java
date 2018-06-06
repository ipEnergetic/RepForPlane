package railwaystation;

import java.util.AbstractList;
import java.util.ArrayList;

import railwaystation.blocktrains.BlockTrain;

import railwaystation.locomotives.electrolocomotives.ElectroLoco;
import railwaystation.locomotives.diesellokomotives.DieselLoco;

import railwaystation.wagons.Wagon;
import railwaystation.wagons.freightwagons.constructionandindustrialmaterialswagom.loosematerialswagon.HopperWagon;

import railwaystation.wagons.passengerwagons.buisnesswagons.BuisnessWagon;

import railwaystation.dispatcher.DeliveryOrder;


public class RailwayStation {
    ArrayList<ElectroLoco> listElectroLoco;
    ArrayList<DieselLoco> listDieselLoco;
    ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    ArrayList<BlockTrain> listBlockTrains = new ArrayList<BlockTrain>();
    ArrayList<DeliveryOrder> listOrders;

    public static void main(String[] args) {
        
    }

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

    public void setListOrders(ArrayList<DeliveryOrder> listOrders) {
        this.listOrders = listOrders;
    }

    public ArrayList<DeliveryOrder> getListOrders() {
        return listOrders;
    }
}
