public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // getters and setters
    public MyRectangle(int x1, int x2, int y1, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // gettters and setters for length, width, perimeter and area
    public double getlength() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double getWidth() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public double getPerimeter() {
        return (getWidth() + getlength()) * 2;
    }

    public double getArea() {
        return getWidth() * getlength();
    }

    // display as a string
    public String toString() {
        return "MyRectangle: [topLeft = " + topLeft + ", bottomRight = " + bottomRight + "]";
    }

}
