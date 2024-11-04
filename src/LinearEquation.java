public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private double yInt;
    private double distance;

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100.0) / 100.0;
    }

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double Distance() {
        double v = Math.pow(x2 - x1, 2);
        double w = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(v + w);
        return roundedToHundredth(distance);
    }

    public double Slope() {
        if (x1 == x2) {
            slope = 0;
        } else {
            slope = (double) (y2 - y1) / (x2 - x1);
        }
        return roundedToHundredth(slope);
    }

    public double yIntercept() {
        yInt= y2 - (Slope() * x2);
        yInt = roundedToHundredth(yInt);
        return yInt;
    }

    public String equation() {
        String equation = "";
        if (y1 == y2) {
            equation = "y = " + yIntercept();
        } else {
            equation = Slope() + "x";
            if (yInt > 0) {
                equation += "+" + yIntercept();
            } else {
                equation += "" + yIntercept();
            }
        }
        return equation;
    }

    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                "The equation of the line between these points is: " + equation() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The slope of this line is: " + Slope() + "\n" +
                "The distance between these points is " + Distance() + "\n";
    }

    public String coordinateForX(double x) {
       double yCord =  slope*x + yInt;
       yCord = roundedToHundredth(yCord);
       String stringYCord = Double.toString(yCord);
       String stringX = Double.toString(x);
       return ( "Coordinate for x: " + "(" + stringX + " , " + stringYCord + ")");
    }

}