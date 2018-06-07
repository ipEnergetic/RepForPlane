package railwaystation.blocktrains;


public class CommodityBlocktrain extends BlockTrain {
    private int countTankWagons;
    private int countAnimalWagons;
    private int countMachineWagons;
    private int countTermoWagon;
    private int countConstructionAndIndustrialMaterialsWagon;

    public void setCountTankWagons(int countTankWagons) {
        this.countTankWagons = countTankWagons;
    }

    public int getCountTankWagons() {
        return countTankWagons;
    }

    public void setCountAnimalWagons(int countAnimalWagons) {
        this.countAnimalWagons = countAnimalWagons;
    }

    public int getCountAnimalWagons() {
        return countAnimalWagons;
    }

    public void setCountMachineWagons(int countMachineWagons) {
        this.countMachineWagons = countMachineWagons;
    }

    public int getCountMachineWagons() {
        return countMachineWagons;
    }

    public void setCountTermoWagon(int countTermoWagon) {
        this.countTermoWagon = countTermoWagon;
    }

    public int getCountTermoWagon() {
        return countTermoWagon;
    }

    public void setCountConstructionAndIndustrialMaterialsWagon(int countConstructionAndIndustrialMaterialsWagon) {
        this.countConstructionAndIndustrialMaterialsWagon = countConstructionAndIndustrialMaterialsWagon;
    }

    public int getCountConstructionAndIndustrialMaterialsWagon() {
        return countConstructionAndIndustrialMaterialsWagon;
    }
}
