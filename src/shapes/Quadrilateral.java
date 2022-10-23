package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public abstract void setLength(int length);

    public abstract void setWidth(int width);

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void Quadrilaterial(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
