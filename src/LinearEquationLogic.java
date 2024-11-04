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
            System.out.print("Enter coordinates for point 1 in the format (x1,y1): ");
            String point1 = myScanner.nextLine();
            System.out.print("Enter coordinates for point 2 in the format (x2,y2): ");
            String point2 = myScanner.nextLine();
            int intX1 = Integer.parseInt(point1.substring(1, point1.indexOf(',')));
            int intY1 = Integer.parseInt(point1.substring(point1.indexOf(',') + 1, point1.length() - 1));
            int intX2 = Integer.parseInt(point2.substring(1, point2.indexOf(',')));
            int intY2 = Integer.parseInt(point2.substring(point2.indexOf(',') + 1, point2.length() - 1));
            LinearEquation line = new LinearEquation(intX1, intY1, intX2, intY2);
            System.out.println(line.lineInfo());
            System.out.print("Enter a new x value: ");
            double xAsked = myScanner.nextDouble();
            myScanner.nextLine();
            System.out.println(line.coordinateForX(xAsked));
            System.out.print("Do you want to keep going? (yes/no): ");
            String keepGoing = myScanner.nextLine();
            if (keepGoing.equalsIgnoreCase("yes")) {
                continueProgram = true;
            } else {
                continueProgram = false;
                System.out.println("Thank you for using the slope calculator, goodbye!");
            }
        }
    }
}