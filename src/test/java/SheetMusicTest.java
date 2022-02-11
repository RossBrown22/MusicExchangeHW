import org.junit.Before;
import org.junit.Test;
import smallstock.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Acoustic", 5.00, 8.00);
    }

    @Test
    public void hasGenre(){
        assertEquals("Acoustic", sheetMusic.getGenre());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5.00, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(8.00, sheetMusic.getSellPrice(), 0.0);
    }
}
