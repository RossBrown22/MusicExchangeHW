package stock;

import interfaces.IPlay;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String brand, String material, String colour, int numberOfStrings, double buyPrice, double sellPrice) {
        super(brand, material, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "Guitar plays music";
    }

    @Override
    public double calculateMarkup() {
        return getMarkupValue();
    }
}
