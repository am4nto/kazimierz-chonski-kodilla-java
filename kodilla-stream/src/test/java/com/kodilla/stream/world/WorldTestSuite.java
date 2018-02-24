package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        World world = new World();

        Continent europe = new Continent();
        Continent africa  = new Continent();
        Continent asia = new Continent();

        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);

        Country poland = new Country(new BigDecimal("80000000"));
        Country germany = new Country(new BigDecimal("50000000"));
        Country spain  = new Country(new BigDecimal("120000000"));
        Country china = new Country(new BigDecimal("1000000000"));
        Country japan = new Country(new BigDecimal("105000000"));
        Country rpa = new Country(new BigDecimal("11000000"));
        Country mozambic = new Country(new BigDecimal("99000000"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        africa.addCountry(rpa);
        africa.addCountry(mozambic);
        asia.addCountry(china);
        asia.addCountry(japan);


        BigDecimal peopleQuantityExpected = new BigDecimal("1465000000");

        Assert.assertEquals(peopleQuantityExpected, world.getPeopleQuantity());


    }





}
