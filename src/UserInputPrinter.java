import java.util.Scanner;

public class UserInputPrinter {
    private String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nType in your input (type STOP to exit): ");

        return sc.nextLine();
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
