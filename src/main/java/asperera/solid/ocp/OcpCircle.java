package asperera.solid.openclosepriciple;

import asperera.solid.Circle;

public class OcpCircle implements IShape{
    private final double radius;

    public OcpCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double CalculateArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

}
