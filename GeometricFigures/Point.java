public class Point {
    private int x;
    private int y;

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point pOne = new Point();
        pOne.setPoint(3, 2);
        System.out.println(pOne.toString());
    }
}
