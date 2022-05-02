package Utils;

import kong.unirest.Unirest;

public class HttpUtils {
    public static String sendGetRequest(String url, String param) {
        String result = Unirest.get(url)
                .routeParam("type", param)
                .asString()
                .getBody();

        return result;
    }
}
