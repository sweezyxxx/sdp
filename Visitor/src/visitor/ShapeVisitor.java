package visitor;

import shapes.Circle;
import shapes.Rectangle;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
