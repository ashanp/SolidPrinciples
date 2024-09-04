package asperera.solid.lsp;

public class OcpSquare implements asperera.solid.lsp.IShape {
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
