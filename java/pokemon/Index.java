package pokemon;

public class Index {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Pokemon pikachu = pokedex.createPokemon("Pikachu", 150, "Electric");
        Pokemon charmander = pokedex.createPokemon("Charmander", 200, "Fire");
        Pokemon squirtle = pokedex.createPokemon("Squirtle", 180, "Water");
        Pokemon blubasaur = pokedex.createPokemon("Bulbasaur", 220, "Leaf");

        charmander.attackPokemon(blubasaur);


        pikachu.attackPokemon(squirtle);

        pokedex.listPokemon();
    }
}
