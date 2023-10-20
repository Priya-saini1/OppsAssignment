package OopsAssignment;

public class circle implements shape {
    private double pi = 3.14;
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is circle.....");
    }

    @Override
    public double size() {
        return pi * radius * radius;
    }

}
