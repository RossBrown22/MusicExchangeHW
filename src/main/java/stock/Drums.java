package stock;

public class Drums extends Instrument{

    private int numberOfDrums;

    public Drums(String brand, String material, String colour, int numberOfDrums, double buyPrice, double sellPrice) {
        super(brand, material, colour, buyPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    @Override
    public String play() {
        return "Bang bang tsss";
    }

    @Override
    public double calculateMarkup() {
        return getMarkupValue();
    }
}
