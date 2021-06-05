package zookeeper;

public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("el gorila ha lanzado algo");
        setEnergyLevel(getEnergyLevel()-5);
    }
    public void eatBananas(){
        System.out.println("el gorila come una banana");
        setEnergyLevel(getEnergyLevel()+10);
    }
    public void climb(){
        System.out.println("el gorila ha trepado a la cima de un arbol");
        setEnergyLevel(getEnergyLevel()-10);
    }
}
