package ru.itpark.domain;

public class House {
    private int id;
    private int price;
    private String area;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", area='" + area + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getArea() {
        return area;
    }

    public House(int id, int price, String area) {
        this.id = id;
        this.price = price;
        this.area = area;
    }
}
