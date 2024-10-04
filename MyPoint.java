public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // check if returns an arrray
    public int[] getXY() {
        return new int[] { x, y };
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // calculate distance between points
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // calculate distance with a different object
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    // display as a string
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
