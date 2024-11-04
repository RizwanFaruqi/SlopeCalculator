import java.util.Objects;
import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation lineEQ;
    private Scanner myScanner;

    public LinearEquationLogic() {
        lineEQ = null;
        myScanner = new Scanner(System.in);
    }

    public void start() {
        Welcome();
    }

    private void Welcome() {
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("Enter x1");
            String x1a = myScanner.nextLine();
            System.out.print("Enter y1");
            String y1a = myScanner.nextLine();
            System.out.print("Enter x2");
            String x2a = myScanner.nextLine();
            System.out.println("Enter y2");
            String y2a = myScanner.nextLine();
            int intX1 = Integer.parseInt(x1a);
            int intY1 = Integer.parseInt(y1a);
            int intX2 = Integer.parseInt(x2a);
            int intY2 = Integer.parseInt(y2a);
            LinearEquation line = new LinearEquation(intX1, intY1, intX2, intY2);
            System.out.println("Points created!");
            System.out.println(line.lineInfo());
            System.out.println("Enter a new x value");
            double xAsked = myScanner.nextDouble();
            line.coordinateForX(xAsked);
            System.out.println("Do you want to keep going");
            String keepGoing = myScanner.nextLine();
            if (keepGoing.equalsIgnoreCase("yes")) {
                continueProgram = true;
            } else {
                continueProgram = false;
            }
        }
    }
}