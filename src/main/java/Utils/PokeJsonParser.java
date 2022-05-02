package Utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;

public class PokeJsonParser {
    public static DamageRelations getDamage(String jsonResponse){
        JsonElement jelement = new JsonParser().parse(jsonResponse);
        JsonObject damageRelationsJson = jelement.getAsJsonObject()
                .get("damage_relations").getAsJsonObject();

        ArrayList<String> doubleDamageTypes = new ArrayList<String>();

        JsonArray doubleDamageTo = damageRelationsJson
                .get("double_damage_to").getAsJsonArray();

        for (JsonElement entry : doubleDamageTo) {
            doubleDamageTypes.add(entry.getAsJsonObject()
                    .get("name")
                    .getAsString());
        }

        ArrayList<String> halfDamageTypes = new ArrayList<String>();

        JsonArray halfDamageTo = damageRelationsJson
                .get("half_damage_to").getAsJsonArray();

        for (JsonElement entry : halfDamageTo) {
            halfDamageTypes.add(entry.getAsJsonObject()
                    .get("name")
                    .getAsString());
        }

        ArrayList<String> noDamageTypes = new ArrayList<String>();

        JsonArray noDamageTo = damageRelationsJson
                .get("no_damage_to").getAsJsonArray();

        for (JsonElement entry : noDamageTo) {
            noDamageTypes.add(entry.getAsJsonObject()
                    .get("name")
                    .getAsString());
        }

        System.out.println(doubleDamageTypes);
        System.out.println(halfDamageTypes);
        System.out.println(noDamageTypes);

        return new DamageRelations(doubleDamageTypes, halfDamageTypes, noDamageTypes);
    }
}
