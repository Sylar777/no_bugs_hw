package hw.second;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void printCarInfo() {
        System.out.println("Бренд: <" + brand + ">, Модель: <" + model + ">, Год: <" + year + ">, Цена: <" + price + ">");
    }
}
