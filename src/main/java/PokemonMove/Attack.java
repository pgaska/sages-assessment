package PokemonMove;

import Utils.DamageRelations;
import Utils.HttpUtils;
import Utils.PokeJsonParser;

public class Attack {
    public void getDamageMultiplier(){
        String response = HttpUtils.sendGetRequest("https://pokeapi.co/api/v2/type/{type}", "psychic");

        DamageRelations damageRelations = PokeJsonParser.getDamage(response);
    }
}
