public class Coordinates {
    // Default values (Kiev city longitude and latitude)
    private String latitude = "50.41";
    private String longitude = "30.93";

    public String getLatitude() {
        return latitude;
    }

    public Coordinates setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public Coordinates setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
}
