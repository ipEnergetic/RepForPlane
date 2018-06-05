package railwaystation;

import java.util.AbstractList;
import java.util.ArrayList;

import railwaystation.blocktrains.locomotives.LocomotiveElectro;
import railwaystation.blocktrains.locomotives.LokomotiveDiesel;
import railwaystation.blocktrains.wagons.Wagon;
import railwaystation.blocktrains.wagons.commoditywagons.HopperWagon;

import railwaystation.order.OrderForTransportation;


public class RailwayStation {
    ArrayList<LocomotiveElectro> listElectroLoco;
    ArrayList<LokomotiveDiesel> listDieselLoco;
    ArrayList<Wagon> listWagons = new ArrayList<Wagon>();
    ArrayList<OrderForTransportation> listOrders;

    private int maxCountPeopleInTerminal;
    private int maxCountCargoInWarehouse;


    public static void main(String[] args) {

    }
}
