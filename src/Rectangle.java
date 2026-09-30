public class Rectangle implements Comparable<Rectangle> {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(this.area(), other.area());
    }
}
