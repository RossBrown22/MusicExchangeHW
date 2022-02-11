package stock;

public class Piano extends Instrument{

    private String typeOfPiano;

    public Piano(String brand, String material, String colour, String typeOfPiano, double buyPrice, double sellPrice) {
        super(brand, material, colour, buyPrice, sellPrice);
        this.typeOfPiano = typeOfPiano;
    }

    public String getTypeOfPiano() {
        return typeOfPiano;
    }

    @Override
    public String play() {
        return "dingaling";
    }

    @Override
    public double calculateMarkup() {
        return getMarkupValue();
    }
}
