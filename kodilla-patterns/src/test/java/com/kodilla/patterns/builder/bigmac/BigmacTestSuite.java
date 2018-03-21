package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    //Given
    public void testBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("z sezamem")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("bekon")
                .ingredient("ser")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsCount = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(2, ingredientsCount);
    }
}
