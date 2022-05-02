package Utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonParser {
    public static void getDamge(String jsonResponse){
        JsonElement jelement = new JsonParser().parse(jsonResponse);
        JsonObject jobject = jelement.getAsJsonObject();
    }
}
