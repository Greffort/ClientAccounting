package com.greffort.auto_accounting.model;

import java.util.List;

public class Car {
    private static final String FILL_DEFAULT = "not specified";

    private String carModel;
    private String VIN;
    private String mileage;
    private String carNumber;
    private List<Repair> repairs;
    private String oil;
    private String typeEngine;
    private String yearOfCarManufacture;

}
