import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void Before() { printer = new Printer(10);
    }

    @Test
    public void canPrint(){
        assertEquals(true, printer.print(2,3));
    }
}

