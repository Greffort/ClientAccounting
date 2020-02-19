package com.greffort.auto_accounting.model;

import junit.framework.TestCase;

public class CarTest extends TestCase {
    public void testCreateCar(){
        Car car = new Car();
        assertEquals(car, car);
    }

}