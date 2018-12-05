package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public void add(House house){
        houseRepository.addHouse(house);
    }

    public List<House> getAllHouse(){
        return houseRepository.getAllHouse();
    }
    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = houseRepository.getAllHouse();
        result.sort(comparator);
        return result;
    }

    public List<House> findByArea(String[] areas) {

        List<House> result = new ArrayList<>();

        for (House house : houseRepository.getAllHouse()) {

            for (String area : areas) {
                if (house.getArea().equals(area)) {
                    result.add(house);
                }
            }
        }
        return result;
    }

    public List<House> findByPrice(int minPrice, int maxPrice) {
        List<House> result = new ArrayList<>();
        for (House house : houseRepository.getAllHouse()) {
            if (house.getPrice() >= minPrice && house.getPrice() <= maxPrice) {
                result.add(house);
            }
        }
        return result;
    }
}
