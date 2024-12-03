package hw.second;

public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public void convertToUSD(double amount) {
        //return amount / rateToUSD;
        System.out.println("Сумма в " + name + " <" + amount + ">, в USD: <" + amount / rateToUSD + ">");
    }

    public void printCurrencyInfo() {
        System.out.println("Валюта: <" + name + ">, Курс к USD: <" + rateToUSD + ">");
    }
}
