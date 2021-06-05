package objectmaster;

public class Wizard extends Human{
    Wizard(){
        super(3,3,8,50);
    }
    public void heal(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()+this.getIntelligence());
    }
    public void fireball(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()-(this.getIntelligence()*3));
    }
}
