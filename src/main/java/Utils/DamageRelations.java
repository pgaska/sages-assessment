package Utils;

import java.util.ArrayList;

public class DamageRelations {
    public DamageRelations(ArrayList<String> doubleDamageTypes, ArrayList<String> halfDamageTypes, ArrayList<String> noDamageTypes) {
        this.doubleDamageTypes = doubleDamageTypes;
        this.halfDamageTypes = halfDamageTypes;
        this.noDamageTypes = noDamageTypes;
    }

    public ArrayList<String> doubleDamageTypes;
    public ArrayList<String> halfDamageTypes;
    public ArrayList<String> noDamageTypes;
}
