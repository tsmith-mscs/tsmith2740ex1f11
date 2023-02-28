package main;

import java.time.LocalDateTime;

public class Building {
    private int buildingId;
    private String address;
    private String city;
    private String state;
    private String zip;
    private int units;
    private LocalDateTime updated;

    public Building() {
        this.buildingId = 0;
        this.address = "address";
        this.city = "city";
        this.state = "state";
        this.zip = "zip";
        this.units = 0;
        this.updated = LocalDateTime.now();

    }

    public Building(int buildingId, String address, String city, String state, String zip, int units) {
        this.buildingId = buildingId;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.units = units;
        this.updated = LocalDateTime.now();
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated() {
        this.updated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Building  " +
                "\n\t BuildingId= " + buildingId +
                "\n\t ApartmentNum= " + address +
                "\n\t SquareFeet= " + city +
                "\n\t Price= " + zip +
                "\n\t Units= " + units +
                "\n\t Updated= " + updated ;
    }
}
