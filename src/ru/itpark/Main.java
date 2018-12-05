package ru.itpark;

import ru.itpark.comparator.SearchMaxComparator;
import ru.itpark.comparator.SearchMinComparator;
import ru.itpark.comparator.SortingAscNameComparator;
import ru.itpark.comparator.SortingDescNameComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;
import ru.itpark.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService(new HouseRepository());

        houseService.add(new House(1, 9_000_000, "Ново-Савиновский"));
        houseService.add(new House(2, 3_150_000, "Вахитовский"));
        houseService.add(new House(3, 4_005_000, "Советский"));
        houseService.add(new House(4, 5_555_000, "Московский"));


        List<House> findByName = houseService.findByArea(new String[]{"Московский", "Ново-Савиновский"});
        findByName.sort(new SortingAscNameComparator());
        System.out.println(findByName);

        List<House> findByPrice = houseService.findByPrice(3_000_000, 5_000_000);
        findByPrice.sort(new SearchMaxComparator());
        System.out.println(findByPrice);    }
}
