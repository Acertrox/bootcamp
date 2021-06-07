package pokemon;

/**
 * AbstractPokemon
 */
public abstract class AbstractPokemon implements PokemonInterface {
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon resultado = new Pokemon();
        resultado.setName(name);
        resultado.setHealth(health);
        resultado.setType(type);
        Pokemon.pokeCount++;
        return resultado;
    }
    public String pokemonInfo(Pokemon pokemon) {
        String resultado = "nombre: "+pokemon.getName()+", tipo: "+pokemon.getType()+", vida: "+pokemon.getHealth();
        return resultado;
    }
    
}