public class Main {
    public static void main(String[] args) {
        System.out.print("UserInputPrinter mode");
        new UserInputPrinter().readAndPrintUserInputInALoop();

        System.out.print("UserInputAnalysisPrinter mode");
        new UserInputAnalysisPrinter().printUserInputAnalysisInALoop();
    }
}