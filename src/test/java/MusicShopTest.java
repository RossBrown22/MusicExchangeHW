import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;
import smallstock.SheetMusic;
import stock.Guitar;
import stock.Item;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    Item item;
    Guitar guitar;
    SheetMusic sheetMusic;
    MusicShop musicShop;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Wood", "Brown", 6, 150.00, 200.00);
        sheetMusic = new SheetMusic("Acoustic", 5.00, 8.00);
        musicShop = new MusicShop();
    }

    @Test
    public void canAddItem(){
        musicShop.addItem(guitar);
        assertEquals(1, musicShop.getItems().size());
    }
    
    @Test
    public void canRemoveItem(){
        musicShop.addItem(guitar);
        musicShop.addItem(sheetMusic);
        musicShop.removeItem(guitar);
        assertEquals(1, musicShop.getItems().size());
    }
}
