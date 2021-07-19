import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 200);
    }

    @Test
    public void printerHasPaper() {
        assertEquals(100, printer.getPaperLevel());
    }

    @Test
    public void printerHasToner(){
        assertEquals(200, printer.getTonerLevel());
    }

    @Test
    public void canPrintCopies(){
        printer.print(2, 25);
        assertEquals(50, printer.getPaperLevel());
        assertEquals(150, printer.getTonerLevel());
    }

    @Test
    public void willNotPrintCopies(){
        printer.print(5, 25);
        assertEquals(100, printer.getPaperLevel());
        assertEquals(200, printer.getTonerLevel());
    }
}
