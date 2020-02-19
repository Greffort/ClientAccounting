package com.greffort.auto_accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//import

import java.util.UUID;


@Getter
@Setter
@Log4j
public class Client {
    private static final String FILL_DEFAULT = "not specified";
    private static final List<Car> FILL_DEFAULT_CAR = new ArrayList<>();

    private String name;
    private String lastName;
    private String phoneNumber;
    private String town;
    private List<Car> cars;
    private UUID uuid;

    public Client() {
        this(FILL_DEFAULT, FILL_DEFAULT, FILL_DEFAULT_CAR);
    }

    public Client(String name, String phoneNumber, List<Car> cars) {
        this(name, FILL_DEFAULT, phoneNumber, FILL_DEFAULT, cars);
    }

    public Client(String name, String lastName, String phoneNumber, String town, List<Car> cars) {
        this(name, lastName, phoneNumber, town, cars, UUID.randomUUID());
    }

    public Client(String name, String lastName, String phoneNumber, String town, List<Car> cars, UUID uuid) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.town = town;
        this.cars = cars;
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
