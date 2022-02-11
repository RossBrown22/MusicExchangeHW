package smallstock;

import stock.Item;

public class Sticks extends Item {

    private String brand;

    public Sticks(String brand, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double calculateMarkup() {
        return getMarkupValue();
    }
}
