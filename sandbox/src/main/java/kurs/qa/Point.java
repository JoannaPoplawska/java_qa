package kurs.qa;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public static double distance(Point p1, Point p2) {
        double x = p2.x - p1.x;
        double y = p2.y - p2.x;
        double distance;
        distance = Math.sqrt(x * x + y * y);
        return distance;

    }

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 1.0;
        p1.y = 2.0;
        Point p2 = new Point();
        p2.x = 4.0;
        p2.y = 6.0;

        System.out.println("Współrzędne dla punktu p1:" + " " + "x = " + " " + p1.x + " " + "y = " + " " + p1.y);
        System.out.println("Współrzędne dla punktu p2:" + " " + "x = " + " " + p2.x + " " + "y = " + " " + p2.y);
        System.out.println("Odległość pomiędzy punktami p1 a p2 wynosi:" + " " + p1.distance(p1,p2));

    }
}

    


