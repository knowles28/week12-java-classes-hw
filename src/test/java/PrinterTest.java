import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    @Test
    public void willPrintWithEnoughPaperEnoughToner() {
        Printer myPrinter = new Printer(10,100);
        myPrinter.print(4, 2 );
        assertEquals(2, myPrinter.getPaperSheets());
        assertEquals(60, myPrinter.getTonerLevel());

    }

    @Test
    public void wontPrintWithoutEnoughPaperEnoughToner() {
        Printer myPrinter = new Printer(7,100);
        myPrinter.print(4, 2);
        assertEquals(7, myPrinter.getPaperSheets());
        assertEquals(100, myPrinter.getTonerLevel());

    }

    @Test
    public void wontPrintWithEnoughPaperNotEnoughToner() {
        Printer myPrinter = new Printer(10,20);
        myPrinter.print(4, 2);
        assertEquals(10, myPrinter.getPaperSheets());
        assertEquals(20, myPrinter.getTonerLevel());

    }
}
