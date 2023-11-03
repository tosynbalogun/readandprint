import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputAnalysisPrinterTest {

    @Test
    public void testPrintUserInputAnalysisInALoopRunsAndTerminates() {
        UserInputAnalysisPrinter printer = new UserInputAnalysisPrinter();

        // Mock the Scanner class to return the user input
        Scanner sc = new Scanner("One\nTwo\nSTOP");
        printer.setScanner(sc);

        // Call the readAndPrintUserInputInALoop() method
        printer.printUserInputAnalysisInALoop();

        assertEquals(printer.getRowCount(), 3);
        assertEquals(printer.getCharacterCount(), 10);
    }
}
