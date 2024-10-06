public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle(new MyPoint(3, 6), new MyPoint(9, 6));

        // display the output
        System.out.println(rectangle);

        rectangle.setTopLeft(new MyPoint(4, 7));
        rectangle.setBottomRight(new MyPoint(5, 8));

        // display getters and setters
        System.out.println("The topLeft points are: " + rectangle.getTopLeft());
        System.out.println("The bottomRight points are: " + rectangle.getBottomRight());

        // display the perimeter and area
        System.out.println("The perimeter of the rctangle is: " + rectangle.getPerimeter());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }

}