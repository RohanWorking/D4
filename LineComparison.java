class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public double[] midpoint() {
        double midX = (x1 + x2) / 2;
        double midY = (y1 + y2) / 2;
        return new double[]{midX, midY};
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 5, 7);

        double length1 = line1.length();
        double length2 = line2.length();

        if (length1 > length2) {
            System.out.println("Line 1 is longer.");
            double[] midPoint = line1.midpoint();
            System.out.printf("Midpoint of Line 1: (%.2f, %.2f)%n", midPoint[0], midPoint[1]);
        } else if (length2 > length1) {
            System.out.println("Line 2 is longer.");
            double[] midPoint = line2.midpoint();
            System.out.printf("Midpoint of Line 2: (%.2f, %.2f)%n", midPoint[0], midPoint[1]);
        } else {
            System.out.println("Both lines are of equal length.");
        }
    }
}
