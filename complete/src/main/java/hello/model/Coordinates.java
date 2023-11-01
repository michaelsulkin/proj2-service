package hello.model;

import java.util.Objects;

public class Coordinates {
    private Double lat;
    private Double lon;
    private String primary;
    private String globe;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getGlobe() {
        return globe;
    }

    public void setGlobe(String globe) {
        this.globe = globe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinates that)) return false;
        return Objects.equals(lat, that.lat) && Objects.equals(lon, that.lon) && Objects.equals(primary, that.primary) && Objects.equals(globe, that.globe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, lon, primary, globe);
    }
}
