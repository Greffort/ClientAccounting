package com.greffort.auto_accounting.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Repair")
public class Repair {

    private String dateOfCompletion;
    private String dateOfBeginning;
    private String completedOperations;
    private String totalRepairCost;
    private UUID uuid;

}
