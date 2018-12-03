package ru.itpark.comparator;

import ru.itpark.domain.House;
import java.util.Comparator;

public class SortingAscNameComparator implements Comparator<House> {

    @Override
    public int compare(House o1, House o2) {
        return o1.getArea().compareTo(o2.getArea());
    }
}
