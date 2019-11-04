package patterns;

import Colors.Color;
import Shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String ShapeName);
    public abstract Color getColor(String ColorName);
}
