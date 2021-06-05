package objectmaster;

public class Index {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        System.out.println("samurai health: "+samurai.getHealth());
        System.out.println("ninja attacks samurai");
        ninja.attack(samurai);
        System.out.println("samurai health: "+samurai.getHealth());
        Samurai samurai1 = new Samurai();
        Wizard wizard = new Wizard();
        Samurai samurai2 = new Samurai();
        System.out.println("wizard throws a fireball to samurai2");
        wizard.fireball(samurai2);
        System.out.println("samurai2 health: "+samurai2.getHealth());
        System.out.println("wizard heals ninja");
        wizard.heal(ninja);
        System.out.println("ninja health: "+ninja.getHealth());
        System.out.println("ninja runs away...");
        ninja.runAway();
        System.out.println("ninja health: "+ninja.getHealth());
        System.out.println("ninja steals samurai1's health");
        ninja.steal(samurai1);
        System.out.println("ninja health: "+ninja.getHealth());
        System.out.println("samurai1 health: "+samurai1.getHealth());
        System.out.println("samurai1 gives ninja a death blow and takes damage as recoil");
        samurai1.deathBlow(ninja);
        System.out.println("ninja health: "+ninja.getHealth());
        System.out.println("samurai1 health: "+samurai1.getHealth());
        System.out.println("samurai1 id = "+samurai1.howMany());
        System.out.println("samurai id = "+samurai.howMany());
        System.out.println("samurai2 id = "+samurai2.howMany());
    }
    
}
