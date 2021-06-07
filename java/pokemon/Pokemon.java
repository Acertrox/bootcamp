package pokemon;

/**
 * Pokemon
 */
public class Pokemon {

    private String name;
    private String type;
    private int health;
    public static int pokeCount;
    void attackPokemon(Pokemon pokemon){
        pokemon.setHealth(pokemon.getHealth()-10);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}