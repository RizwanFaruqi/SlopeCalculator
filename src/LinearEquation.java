public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public void Distance() {
        double v = Math.pow(x2-x1, 2);
        double w = Math.pow(y2-y1, 2);
        double z = Math.sqrt(v+w);
    }


    public void Slope() {
        double slope = (double) (y2 - y1) / (x2-x1);
    }
}
