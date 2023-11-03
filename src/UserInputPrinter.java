import java.util.Scanner;

public class UserInputPrinter {
    private Scanner scanner;

    public UserInputPrinter() {
        this.setScanner(new Scanner(System.in));
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String readUserInput() {
        System.out.print("\nType in your input (type STOP to exit): ");

        return this.scanner.nextLine();
    }

    public void readAndPrintUserInputInALoop() {
        String userInput;

        while (true) {
            userInput = readUserInput();

            if (userInput.contains("STOP")) {
                return;
            }

            System.out.print(userInput);
        }
    }
}
