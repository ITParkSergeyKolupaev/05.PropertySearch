package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> houses = new ArrayList<>();

    public void addHouse(House house){
        houses.add(house);
    }
    public List<House> getAllHouse(){
        return houses;
    }
}
