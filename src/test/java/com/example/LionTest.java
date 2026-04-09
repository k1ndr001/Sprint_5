package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;
public class LionTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void maleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);

        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionHasNoMane() throws Exception {
        Lion lion = new Lion("Самка", feline);

        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void invalidSexThrowsException() throws Exception {
        new Lion("Неизвестно", feline);
    }

    @Test
    public void getKittensReturnsFromFeline() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        int kittens = lion.getKittens();

        Assert.assertEquals(3, kittens);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Мясо");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion("Самец", feline);

        List<String> actual = lion.getFood();

        Assert.assertEquals(expected, actual);
    }
}
