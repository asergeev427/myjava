public class Circle {
    private int x;
    private int y;
    private int rad;

    public void setCircle(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + rad + ")";
    }

    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.setCircle(4, 6, 8);
        System.out.println(cir.toString());
    }
}
