package com.greffort.auto_accounting.entity;

import com.greffort.auto_accounting.model.Repair;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CAR")
public class Car {

    private String carModel;
    private String VIN;
    private String mileage;
    private String carNumber;
    private List<Repair> repairs;
    private String oil;
    private String typeEngine;
    private String yearOfCarManufacture;
    private UUID uuid;


}
