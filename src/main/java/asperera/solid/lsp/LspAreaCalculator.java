package asperera.solid.lsp;

public class OcpAreaCalculator {

    public double calculateArea(asperera.solid.lsp.IShape shape){
        double area = shape.CalculateArea();
        return area;
    }

}
