package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        Country czad = new Country(new BigDecimal(11324598));
        Country libia = new Country(new BigDecimal(7123123));
        Country uganda = new Country(new BigDecimal(15348732));
        Country poland = new Country((new BigDecimal(38221312)));
        Country france = new Country(new BigDecimal(71739201));
        Country netherlands = new Country(new BigDecimal(16700132));
        Country russia = new Country(new BigDecimal(140189843));
        Country mongolia = new Country(new BigDecimal(1947564));
        Country indie = new Country(new BigDecimal(1127546921));
        Continent africa = new Continent();
        africa.addCountry(czad);
        africa.addCountry(libia);
        africa.addCountry(uganda);
        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(netherlands);
        Continent asia = new Continent();
        asia.addCountry(russia);
        asia.addCountry(mongolia);
        asia.addCountry(indie);
        World world = new World();
        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(asia);
        BigDecimal result = new BigDecimal(1430141426);
        Assert.assertEquals(result, world.getPeopleQuantity());
    }
}
