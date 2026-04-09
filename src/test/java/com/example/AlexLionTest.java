package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class AlexLionTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        AlexLion alex = new AlexLion(feline);

        List<String> friends = alex.getFriends();

        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), friends);
    }

    @Test
    public void getPlaceOfLivingReturnsCorrectPlace() throws Exception {
        AlexLion alex = new AlexLion(feline);

        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        AlexLion alex = new AlexLion(feline);

        Assert.assertEquals(0, alex.getKittens());
    }
}