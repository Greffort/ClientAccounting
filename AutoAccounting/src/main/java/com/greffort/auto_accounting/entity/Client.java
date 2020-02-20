package com.greffort.auto_accounting.entity;

import com.greffort.auto_accounting.model.Car;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CLIENT")
public class Client {

    private String name;
    private String lastName;
    private String phoneNumber;
    private String town;
    private List<Car> cars;
    private UUID uuid;


}
