import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserInputPrinterTest {

    @Test
    public void testReadAndPrintUserInputInALoopRunsAndTerminates() {
        UserInputPrinter printer = new UserInputPrinter();

        // Mock the Scanner class to return the user input
        Scanner sc = new Scanner("This is some user input.\nSTOP");
        printer.setScanner(sc);

        // Call the readAndPrintUserInputInALoop() method
        printer.readAndPrintUserInputInALoop();
    }
}
