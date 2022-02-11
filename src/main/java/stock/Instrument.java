package stock;

import interfaces.IPlay;

public abstract class Instrument extends Item implements IPlay {

    private String brand;
    private String material;
    private String colour;

    public Instrument(String brand, String material, String colour, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.brand = brand;
        this.material = material;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
