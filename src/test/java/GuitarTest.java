import org.junit.Before;
import org.junit.Test;
import stock.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Wood", "Brown", 6, 150.00, 200.00);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(150.00, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void getMarkupValue(){
        assertEquals(50.00, guitar.getMarkupValue(), 0.0);
    }
}
