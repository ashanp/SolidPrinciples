package asperera.solid.ocp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        OcpCircle circle1 = new OcpCircle(10.00);
        OcpSquare square1 = new OcpSquare(10.00);

        System.out.println(square1.CalculateArea());

        List<Object> shapes = List.of(circle1,square1);
        double area = 0;

        for (Object shape : shapes){
            if(shape instanceof OcpCircle){
                System.out.println("Circle area :"+((OcpCircle) shape).CalculateArea());
                area += ((OcpCircle) shape).CalculateArea();
            }
            else if(shape instanceof OcpSquare){
                System.out.println("Circle Square :"+((OcpSquare) shape).CalculateArea());
                area += ((OcpSquare) shape).CalculateArea();
            }
        }

        System.out.println("total :"+area);

    }
}
