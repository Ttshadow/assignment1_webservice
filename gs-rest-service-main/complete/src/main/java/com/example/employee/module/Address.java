package com.example.employee.module;

public class Address {
    private int number;
    private String streetName;
    private String city;
    private String country;

    public Address(int number, String streetName, String city, String country) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
}
