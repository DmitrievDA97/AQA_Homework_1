package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainBelowBoundary() {
        int purchase = 400;
        assertEquals(service.remain(purchase), 600);
    }


    @Test
    public void shouldRemainAboveBoundary() {
        int purchase = 1100;
        assertEquals(service.remain(purchase), 900);
    }

    @Test
    public void shouldNotRemainEqualBoundary() {
        int purchase = 1000;
        assertEquals(service.remain(purchase), 0);
    }

    @Test
    public void shouldRemainBoundaryIfZeroPurchase() {
        int purchase = 0;
        assertEquals(service.remain(purchase), 1000);
    }
}