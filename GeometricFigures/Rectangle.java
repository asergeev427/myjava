public class Rectangle {
    private int width;
    private int height;

    public void setRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        if (width == height) {
            System.out.println("Фигура является квадратом");
        }
        return "(" + width + ", " + height + ")";
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setRectangle(9, 9);
        System.out.println(rec.toString());
    }
}
