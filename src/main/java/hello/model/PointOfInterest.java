package hello.model;

import java.util.Objects;

public class PointOfInterest {
    private Integer pageid;
    private String title;
    private Coordinates coordinates;
    public String description;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointOfInterest that)) return false;
        return Objects.equals(pageid, that.pageid) && Objects.equals(title, that.title) && Objects.equals(coordinates, that.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageid, title, coordinates);
    }

    @Override
    public String toString() {
        return "PointOfInterest{" +
                "pageid=" + pageid +
                ", title='" + title + '\'' +
                ", coordinates=" + coordinates +
                ", description='" + description + '\'' +
                '}';
    }
}
