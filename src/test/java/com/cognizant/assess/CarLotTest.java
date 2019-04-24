package com.cognizant.assess;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class CarLotTest {
    Car car;
    @Before
    public void setup(){
        car = new Car();
    }

    @Test
    public void FirstVehicleEntry() {
        //expected
        int expected = 0;

        //actual
        int actual = car.getCarCount();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }

    @Test
    public void TotalParking() {
        //expected
        int expected = 3;

        //actual
        car.entry(new CarDetails("Ford",4));
        car.entry(new CarDetails("Ford",4));
        car.exit()
        int actual = car.getCarCount();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }



    public void DisplayDetails() {
        //expected
        String expected = "Ford-4";

        //actual
        car.entry(new CarDetails("Ford",21));
        int actual = car.getCarDetails();

        //assert
        Assert.assertEquals(expected, actual);

        //teardown
    }
}