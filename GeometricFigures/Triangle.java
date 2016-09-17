public class Triangle {
    private int cath1;
    private int cath2;
    private int hyp;

    public void setTriangle(int cath1, int cath2, int hyp) {
        this.cath1 = cath1;
        this.cath2 = cath2;
        this.hyp = hyp;
    }

    public String toString() {
        return "(" + cath1 + ", " + cath2 + ", " + hyp + ")";
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.setTriangle(9, 7, 6);
        System.out.println(tri.toString());
    }
}
