public class Line extends Point {

    public static void CreateLine(double x1, double y1, double x2, double y2) {
        Point one = new Point();
        one.CreatePoint(x1, y1);
        Point two = new Point();
        two.CreatePoint(x2, y2);
    }
}
