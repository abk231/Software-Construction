package patterns;

import Shapes.Shape;
import Shapes.ShapeFactory;
import java.io.*;

public class FactoryDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        Shape shapeselected;
        
        System.out.println("Enter Shape: ");
        choice = br.readLine();
        
        
        ShapeFactory factory = new ShapeFactory();
        shapeselected = factory.getShape(choice);
        shapeselected.draw();
        
        System.out.println("Enter Color: ");
        choice = br.readLine();
        FactoryProducer fobj = new FactoryProducer();
        AbstractFactory ffobj = fobj.getFactory("color");
        ffobj.getColor(choice).fill();
        //======================================
    }
}
