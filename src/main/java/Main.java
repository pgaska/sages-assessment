import Utils.HttpUtils;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        try {
            HttpUtils.sendGetRequest("https://pokeapi.co/api/v2/type/fire");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
