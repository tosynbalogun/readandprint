import java.util.Scanner;

public class UserInputAnalysisPrinter {

    private int rowCount;
    private int characterCount;

    public UserInputAnalysisPrinter() {
        rowCount = 0;
        characterCount = 0;
    }

    private String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nType in your input (type STOP to exit): ");

        String userInput = sc.nextLine();
        rowCount++; // increment the row count by one after each read
        characterCount += userInput.length(); // increment the number of chars after each read

        return userInput;
    }

    private String getUserInputAnalysis() {
        return String.format("Number of rows: %d\nNumber of characters: %d", rowCount, characterCount);
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
