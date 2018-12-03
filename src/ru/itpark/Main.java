package ru.itpark;

import ru.itpark.comparator.SearchMaxComparator;
import ru.itpark.comparator.SearchMinComparator;
import ru.itpark.comparator.SortingAscNameComparator;
import ru.itpark.comparator.SortingDescNameComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService(new HouseRepository());

        houseService.add(new House(1, 100_000, "Ново-Савиновский"));
        houseService.add(new House(2, 150_000, "Вахитовский"));
        houseService.add(new House(3, 75_000, "Советский"));
        houseService.add(new House(4, 255_000, "Московский"));

        System.out.println(houseService.getSorted(new SearchMinComparator()));
        System.out.println(houseService.getSorted(new SearchMaxComparator()));
        System.out.println(houseService.getSorted(new SortingAscNameComparator()));
        System.out.println(houseService.getSorted(new SortingDescNameComparator()));

    }
}
