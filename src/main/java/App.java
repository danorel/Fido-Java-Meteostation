import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.Weather;

public class App {
    public static void main(String[] args) {
        URLBuilder builder = new URLBuilder();
        Coordinates coordinates = new Coordinates();
        coordinates.setLatitude("50.41").setLongitude("30.93");
        FileGenerator generator = new FileGenerator();
        generator.createDirectory("data");
        generator.createFile("data/data.txt");
        HttpResponse<Weather> jsonResponse = null;
        Unirest.setObjectMapper(new JSONConverter());
        try {
            jsonResponse = Unirest.get(builder.setLng(coordinates.getLongitude()).setLat(coordinates.getLatitude()).setKey().generateUrl())
                    .header("accept", "application/json")
                    .asObject(Weather.class);
        } catch (UnirestException exception) {
            exception.printStackTrace();
        }
        Weather weather = jsonResponse.getBody();
        generator.writeFile(weather.toString());
        System.out.println(weather);
    }
}
