package pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
    private int myPokemons = 0;
    ArrayList<Pokemon> pkmn = new ArrayList<>();
    public Pokemon createPokemon(String name, int health, String type){
        Pokemon resultado = super.createPokemon(name, health, type);
        pkmn.add(resultado);
        setMyPokemons(getMyPokemons()+1);
        return resultado;
    }
    public void listPokemon() {
        for (Pokemon pokemon : pkmn) {
            System.out.println(pokemonInfo(pokemon));
        }
    }
    public int getMyPokemons() {
        return myPokemons;
    }
    public void setMyPokemons(int myPokemons) {
        this.myPokemons = myPokemons;
    }
}
