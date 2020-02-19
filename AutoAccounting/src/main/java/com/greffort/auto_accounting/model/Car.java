package com.greffort.auto_accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


@Log4j
@Getter
@Setter
public class Car {
    private static final String FILL_DEFAULT = "not specified";
    private static final List<Repair> FILL_DEFAULT_REPAIR = new ArrayList<>();

    private String carModel;
    private String VIN;
    private String mileage;
    private String carNumber;
    private List<Repair> repairs;
    private String oil;
    private String typeEngine;
    private String yearOfCarManufacture;
    private UUID uuid;

    public Car(){
        this(FILL_DEFAULT,FILL_DEFAULT,FILL_DEFAULT,FILL_DEFAULT,FILL_DEFAULT_REPAIR,FILL_DEFAULT,FILL_DEFAULT,FILL_DEFAULT);
    }

    public Car(String carModel, String VIN, String mileage, String carNumber, List<Repair> repairs, String oil, String typeEngine, String yearOfCarManufacture) {
        this(carModel, VIN, mileage, carNumber, repairs, oil, typeEngine, yearOfCarManufacture,  UUID.randomUUID());
    }
    public Car(String carModel, String VIN, String mileage, String carNumber, List<Repair> repairs, String oil, String typeEngine, String yearOfCarManufacture, UUID uuid) {
        this.carModel = carModel;
        this.VIN = VIN;
        this.mileage = mileage;
        this.carNumber = carNumber;
        this.repairs = repairs;
        this.oil = oil;
        this.typeEngine = typeEngine;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carModel, car.carModel) &&
                Objects.equals(VIN, car.VIN) &&
                Objects.equals(mileage, car.mileage) &&
                Objects.equals(carNumber, car.carNumber) &&
                Objects.equals(repairs, car.repairs) &&
                Objects.equals(oil, car.oil) &&
                Objects.equals(typeEngine, car.typeEngine) &&
                Objects.equals(yearOfCarManufacture, car.yearOfCarManufacture) &&
                Objects.equals(uuid, car.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, VIN, mileage, carNumber, repairs, oil, typeEngine, yearOfCarManufacture, uuid);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", VIN='" + VIN + '\'' +
                ", mileage='" + mileage + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", repairs=" + repairs +
                ", oil='" + oil + '\'' +
                ", typeEngine='" + typeEngine + '\'' +
                ", yearOfCarManufacture='" + yearOfCarManufacture + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
