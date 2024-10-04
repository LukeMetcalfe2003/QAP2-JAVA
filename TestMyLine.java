public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(2, 4, 6, 8);

        // display the output
        System.out.println(line);

        // display getters and setters
        line.setBegin(new MyPoint(7, 8));
        line.setEnd(new MyPoint(9, 10));

        System.out.println("The Begining points are: " + line.getBegin());
        System.out.println("The ending ponits are: " + line.getEnd());

        // Display gradiant and length
        System.out.println("The Length is: " + line.getLength());
        System.out.println("The gradient is " + line.getGradiant());
    }
}
