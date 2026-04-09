package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;
public class FelineTest {

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();

        List<String> food = feline.eatMeat();

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {
        Feline feline = new Feline();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturnsOne() {
        Feline feline = new Feline();

        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParamReturnsValue() {
        Feline feline = new Feline();

        Assert.assertEquals(5, feline.getKittens(5));
    }
}
