package hw.second;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        price = price - price * percentage / 100;
    }

    public void printPhoneDetails() {
        System.out.println("Телефон: <" + brand + "> <" + model + ">, Цена: <" + price + ">");
    }
}
