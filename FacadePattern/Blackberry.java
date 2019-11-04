
package FacadePattern;

public class Blackberry implements MobileShop{
    @Override
    public void ModelNo() {
        System.out.println("Blackberry Curve");
    }

    @Override
    public void Price() {
        System.out.println("Rs. 15000");
    }
}
