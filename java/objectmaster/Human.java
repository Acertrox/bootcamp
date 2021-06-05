package objectmaster;

public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    private static int nextId = 0;
    protected int id;
    Human(){
        this(3,3,3,100);
    }
    Human(int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }
    Human(int strength, int stealth, int intelligence, int health, boolean samurai){
        this(strength,stealth,intelligence,health);
        this.setId(nextId);
        Human.nextId++;
    }
    public int getHealth() {
        return health;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getStealth() {
        return stealth;
    }
    public int getStrength() {
        return strength;
    }
    public int getId() {
        return id;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void displayHealth(){
        System.out.println("vida: "+health);
    }
    public void attack(Human objetivo){
        objetivo.setHealth(objetivo.getHealth()-this.getStrength());
    }
}
