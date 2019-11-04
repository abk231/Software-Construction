
package patterns;

import Colors.ColorFactory;
import Shapes.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
