package zookeeper;

public class Bat extends Mammal{
    Bat(){
        super(300);
    }
    public void fly(){
        System.out.println("el murcielago gigante vuela!");
        setEnergyLevel(getEnergyLevel()-50);
    }
    public void eatHumans(){
        System.out.println("bueno, no importa");
        setEnergyLevel(getEnergyLevel()+25);
    }
    public void attackTown(){
        System.out.println("la ciudad está en llamas");
        setEnergyLevel(getEnergyLevel()-100);
    }
}
