package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNGTest {

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(0);
        Assert.assertEquals(1000, result);
    }

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(500);
        Assert.assertEquals(500, result);
    }

    @Test
    public void testRemainExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1200);
        Assert.assertEquals(800, result);
    }

}