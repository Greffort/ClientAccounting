package com.greffort.auto_accounting.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import java.util.UUID;

public class Client {
    private static final String FILL_DEFAULT = "not specified";
    private static final String FILL_CAR = "new car object";

    private String name;
    private String lastName;
    private String phoneNumber;
    private String town;
    private List<Car> cars;
    private UUID uuid;

    //public Client() {
    //}

    public Client(String name, String phoneNumber, List<Car> cars) {
        this(name, FILL_DEFAULT, phoneNumber, FILL_DEFAULT, cars, UUID.randomUUID());
    }

    public Client(String name, String lastName, String phoneNumber, String town, List<Car> cars, UUID uuid) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.town = town;
        this.cars = cars;
        this.uuid = uuid;
    }

    public static String getFillDefault() {
        return FILL_DEFAULT;
    }

    public static String getFillCar() {
        return FILL_CAR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(lastName, client.lastName) &&
                Objects.equals(phoneNumber, client.phoneNumber) &&
                Objects.equals(town, client.town) &&
                Objects.equals(cars, client.cars) &&
                Objects.equals(uuid, client.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phoneNumber, town, cars, uuid);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", town='" + town + '\'' +
                ", cars=" + cars +
                ", uuid=" + uuid +
                '}';
    }
}
