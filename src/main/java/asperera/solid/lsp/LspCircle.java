package asperera.solid.lsp;

public class OcpCircle implements asperera.solid.lsp.IShape {
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
