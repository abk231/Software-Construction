package Colors;

import Shapes.Shape;
import patterns.AbstractFactory;


public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String ColorName){
        if(ColorName.equals("Blue")){
            return this.getBlue();
        }else if(ColorName.equals("Red")){
            return this.getRed();
        }else if(ColorName.equals("Green")){
            return this.getGreen();
        }
        return null;
    }
    
    public Color getRed(){
        return new Red();
    }
    
    public Color getGreen(){
        return new Green();
    }
    
    public Color getBlue(){
        return new Blue();
    }

    @Override
    public Shape getShape(String ShapeName) {
        return null;
    }

}
