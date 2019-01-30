import java.text.MessageFormat;

public class URLBuilder {
    private String lat;
    private String lng;
    private String key;

    public String generateUrl(){
        return MessageFormat.format(
                "https://api.darksky.net/forecast/{0}/{1},{2}?units=si", key, lat, lng
        );
    }

    public URLBuilder setKey(String key) {
        this.key = key;
        return this;
    }

    public URLBuilder setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public URLBuilder setLat(String lat) {
        this.lat = lat;
        return this;
    }
}
