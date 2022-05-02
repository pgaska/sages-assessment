import Utils.HttpUtils;
import Utils.PokeJsonParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String response = HttpUtils.sendGetRequest("https://pokeapi.co/api/v2/type/{type}", "rock");
        System.out.println(response);
    }
}
