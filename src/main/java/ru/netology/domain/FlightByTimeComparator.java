package ru.netology.domain;

import java.util.Comparator;

public class FlightByTimeComparator implements Comparator<Flight> {

    public int compare(Flight f1, Flight f2) {
        return f1.getTime() - f2.getTime();
    }
}