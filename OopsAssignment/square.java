package OopsAssignment;

public class square implements shape {

    private double length;

    public square(double length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("This is square....");
    }

    @Override
    public double size() {
        return length * length;
    }

}
