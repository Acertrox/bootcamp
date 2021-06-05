package objectmaster;

public class Ninja extends Human{
    Ninja(){
        super(3,10,3,100);
    }
    public void steal(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()-this.getStealth());
        this.setHealth(this.getHealth()+this.getStealth());
    }
    public void runAway(){
        this.setHealth(this.getHealth()-10);
    }
    
}
