package com.greffort.auto_accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Log4j
public class Repair {
    private static final String FILL_DEFAULT = "not specified";

    private String dateOfCompletion;
    private String dateOfBeginning;
    private String completedOperations;
    private String totalRepairCost;
    private UUID uuid;

    public Repair() {
        this(FILL_DEFAULT, FILL_DEFAULT, FILL_DEFAULT, FILL_DEFAULT);
    }

    public Repair(String dateOfCompletion, String dateOfBeginning, String completedOperations, String totalRepairCost) {
        this(dateOfCompletion, dateOfBeginning, completedOperations, totalRepairCost, UUID.randomUUID());
    }

    public Repair(String dateOfCompletion, String dateOfBeginning, String completedOperations, String totalRepairCost, UUID uuid) {
        this.dateOfCompletion = dateOfCompletion;
        this.dateOfBeginning = dateOfBeginning;
        this.completedOperations = completedOperations;
        this.totalRepairCost = totalRepairCost;
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repair repair = (Repair) o;
        return Objects.equals(dateOfCompletion, repair.dateOfCompletion) &&
                Objects.equals(dateOfBeginning, repair.dateOfBeginning) &&
                Objects.equals(completedOperations, repair.completedOperations) &&
                Objects.equals(totalRepairCost, repair.totalRepairCost) &&
                Objects.equals(uuid, repair.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfCompletion, dateOfBeginning, completedOperations, totalRepairCost, uuid);
    }

    @Override
    public String toString() {
        return "Repair{" +
                "dateOfCompletion='" + dateOfCompletion + '\'' +
                ", dateOfBeginning='" + dateOfBeginning + '\'' +
                ", completedOperations='" + completedOperations + '\'' +
                ", totalRepairCost='" + totalRepairCost + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
