package asperera.solid.openclosepriciple;

import java.util.List;

public class OcpAreaCalculator {

    public double calculateArea(IShape shape){
        double area = shape.CalculateArea();
        return area;
    }

}
