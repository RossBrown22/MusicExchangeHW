package smallstock;

import stock.Item;

public class SheetMusic extends Item {

    private String genre;

    public SheetMusic(String genre, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public double calculateMarkup() {
        return getMarkupValue();
    }
}
