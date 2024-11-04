import java.util.Scanner;
public class LinearEquationLogic {
    private LinearEquation lineEQ;
    private Scanner myScanner;

    public LinearEquationLogic() {
        lineEQ = null;
        myScanner = new Scanner(System.in);
    }

    public void start() {
        getLineInfo();
    }


    private void getLineInfo () {
        System.out.print("Enter x1");
        int x1a = myScanner.nextInt();
        System.out.print("Enter y1");
        int y1a = myScanner.nextInt();
        System.out.print("Enter x2");
        int x2a = myScanner.nextInt();
        System.out.println("Enter y2");
        int y2a = myScanner.nextInt();
        LinearEquation line = new LinearEquation(x1a, y1a, x2a, y2a);
        System.out.println("Points created!");
    }
}
