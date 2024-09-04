package asperera.solid.openclosepriciple;

public class OcpSquare implements IShape{
    private final double length;

    public OcpSquare(double length) {
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    @Override
    public double CalculateArea() {
        return length * length;
    }
}
