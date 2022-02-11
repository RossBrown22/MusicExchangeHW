package smallstock;

import stock.Item;

public class Strings extends Item {

    private String brand;

    public Strings(String brand, double buyPrice, double sellPrice) {
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
