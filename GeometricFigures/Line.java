public class Line {
    private int x1, y1, x2, y2;
    private int length;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public String toString() {
        length = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return String.valueOf(length);
    }

    public static void main(String[] args) {
        Line oneLine = new Line(4, 6, 2, 9);
        System.out.println(oneLine.x1 + " " + oneLine.y1);
        System.out.println(oneLine.x2 + " " + oneLine.y2);
        System.out.println(oneLine.toString());
    }
}
