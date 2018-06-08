package railwaystation;

import java.util.AbstractList;
import java.util.ArrayList;

import railwaystation.blocktrains.BlockTrain;

import railwaystation.locomotives.electro.ElectroLoco;
import railwaystation.locomotives.diesel.DieselLoco;

import railwaystation.wagons.Wagon;
import railwaystation.wagons.commodity.HopperIndustrial;

import railwaystation.wagons.passenger.Buisness;

import railwaystation.administration.OrderDelivery;


public class RailwayStation {
    ArrayList<ElectroLoco> listElectroLoco;
    ArrayList<DieselLoco> listDieselLoco;
    ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    ArrayList<BlockTrain> listBlockTrains = new ArrayList<BlockTrain>();
    ArrayList<OrderDelivery> listOrders;

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

    public void setListOrders(ArrayList<OrderDelivery> listOrders) {
        this.listOrders = listOrders;
    }

    public ArrayList<OrderDelivery> getListOrders() {
        return listOrders;
    }
}
