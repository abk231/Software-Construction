package Shapes;

import Colors.Color;
import Shapes.Shape;
import patterns.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String ShapeName){
        if(ShapeName.equals("Circle")){
            return this.getCircle();
        }else if(ShapeName.equals("Square")){
            return this.getSquare();
        }else if(ShapeName.equals("Rectangle")){
            return this.getRectangle();
        }
        return null;
    }
    
    public Shape getCircle(){
        return new Circle();
    }
    
    public Shape getSquare(){
        return new Square();
    }
    
    public Shape getRectangle(){
        return new Rectangle();
    }

    @Override
    public Color getColor(String ColorName) {
        return null;
    }
}
