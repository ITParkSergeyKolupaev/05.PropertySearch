package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

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
}
