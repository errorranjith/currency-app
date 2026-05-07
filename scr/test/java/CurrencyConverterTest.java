import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {

    CurrencyConverter c = new CurrencyConverter();

    @Test
    public void testRupeeToDollar() {
        assertEquals(12.0, c.rupeeToDollar(1000), 0.1);
    }

    @Test
    public void testRupeeToEuro() {
        assertEquals(11.0, c.rupeeToEuro(1000), 0.1);
    }

    @Test
    public void testDollarToRupee() {
        assertEquals(1000.0, c.dollarToRupee(12), 0.1);
    }
}
