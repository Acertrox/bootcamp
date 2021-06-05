package zookeeper;

public class Mammal {
    private int energyLevel;
    public Mammal(){
        this(100);
    }
    public Mammal(int value){
        setEnergyLevel(value);
    }
    public void displayEnergy(){
        System.out.println(getEnergyLevel());
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
