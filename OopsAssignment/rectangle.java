package OopsAssignment;

public class rectangle implements shape {

    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle ....");
    }

    @Override
    public double size() {
        return length * width;
    }

}
