import shapes.*;
import visitor.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(10),
                new Rectangle(5, 10)
        );

        ShapeVisitor areaVisitor = new AreaCalculator();
        ShapeVisitor perimeterVisitor = new PerimeterCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
            shape.accept(perimeterVisitor);
        }
    }
}
