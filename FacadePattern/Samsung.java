
package FacadePattern;

public class Samsung implements MobileShop{

    @Override
    public void ModelNo() {
        System.out.println("Samsung A5");
    }

    @Override
    public void Price() {
        System.out.println("Rs. 25000");
    }
    
}
