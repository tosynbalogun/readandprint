import java.util.Scanner;

public class UserInputAnalysisPrinter {

    private int rowCount;
    private int characterCount;
    private Scanner scanner;

    public int getRowCount() {
        return this.rowCount;
    }

    public int getCharacterCount() {
        return this.characterCount;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public UserInputAnalysisPrinter() {
        rowCount = 0;
        characterCount = 0;
        this.setScanner(new Scanner(System.in));
    }

    private String readUserInput() {
        System.out.print("\nType in your input (type STOP to exit): ");

        String userInput = this.scanner.nextLine();
        rowCount++; // increment the row count by one after each read
        characterCount += userInput.length(); // increment the number of chars after each read

        return userInput;
    }

    private String getUserInputAnalysis() {
        return String.format("\nNumber of rows: %d\nNumber of characters: %d", rowCount, characterCount);
    }

    public void printUserInputAnalysisInALoop() {
        String userInput;
        String userInputAnalysis;

        while (true) {
            userInput = readUserInput();

            if (userInput.contains("STOP")) {
                return;
            }

            userInputAnalysis = getUserInputAnalysis();

            System.out.print(userInputAnalysis);
        }
    }
}
