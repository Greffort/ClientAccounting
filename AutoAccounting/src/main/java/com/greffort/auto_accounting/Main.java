package com.greffort.auto_accounting;

import com.greffort.auto_accounting.model.Car;
import com.greffort.auto_accounting.model.Client;
import com.greffort.auto_accounting.model.Repair;

public class Main {
    public static void main(String[] args) {

        Client clientForTest_1 = new Client();

        Car carForTest_1 = new Car();

        Repair repairForCar_1 = new Repair();

        System.out.println(carForTest_1.getCarModel());
        System.out.println(clientForTest_1.toString());
        System.out.println(carForTest_1.toString());
        System.out.println(repairForCar_1.toString());


    }
}