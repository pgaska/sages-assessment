package PokemonMove;

import Utils.DamageRelations;
import Utils.HttpUtils;
import Utils.PokeJsonParser;

public class Attack {
    public void getDamageMultiplier(String currentType, String[] enemyTypes){
        String response = HttpUtils.sendGetRequest("https://pokeapi.co/api/v2/type/{type}", currentType);

        DamageRelations damageRelations = PokeJsonParser.getDamage(response);

        float multiplier = 1;

        for(int i=0; i<enemyTypes.length; i++){
            if(damageRelations.doubleDamageTypes.contains(enemyTypes[i])){
                multiplier *= 2;
            }
            else if(damageRelations.halfDamageTypes.contains(enemyTypes[i])){
                multiplier *= 0.5f;
            }
            else if(damageRelations.noDamageTypes.contains(enemyTypes[i])){
                multiplier *= 0;
            }
        }

        System.out.println(multiplier + "x");
    }
}
