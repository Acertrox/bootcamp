package objectmaster;

public class Samurai extends Human{
    Samurai(){
        super(3,3,3,200,true);
    }
    public void deathBlow(Human objetivo){
        objetivo.setHealth(0);
        this.setHealth(this.getHealth()/2);
    }
    public void meditate(){
        this.setHealth(this.getHealth()+(this.getHealth()/2));
    }
    public int howMany(){
        return getId();
    }

}
