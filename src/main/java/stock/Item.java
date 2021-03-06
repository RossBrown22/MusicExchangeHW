package stock;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Item implements ISell {

    private double buyPrice;
    private double sellPrice;

    public Item(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getMarkupValue(){
        return this.getSellPrice() - this.getBuyPrice();
    }
}
