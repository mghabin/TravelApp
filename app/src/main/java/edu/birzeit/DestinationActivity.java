package edu.birzeit;

import java.net.URL;

public class DestinationActivity {
    private String city;
    private String country;
    private String continent;
    private double longitude;
    private double latitude;
    private double cost;
    private String img;
    private String description;

    public DestinationActivity() {
    }

    public DestinationActivity(String city, String country, String continent, double longitude, double latitude, double cost, String img, String description) {
        this.city = city;
        this.country = country;
        this.continent = continent;
        this.longitude = longitude;
        this.latitude = latitude;
        this.cost = cost;
        this.img = img;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DestinationActivity{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", continent='" + continent + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", cost=" + cost +
                ", img=" + img +
                ", description='" + description + '\'' +
                '}';
    }
}
