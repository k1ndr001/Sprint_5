package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;
public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);

        String sound = cat.getSound();

        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);

        List<String> expected = List.of("Мясо");

        Mockito.when(feline.eatMeat()).thenReturn(expected);

        List<String> actual = cat.getFood();

        Assert.assertEquals(expected, actual);
    }
}