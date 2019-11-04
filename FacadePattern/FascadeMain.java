package FacadePattern;

public class FascadeMain {
    public static void main(String[] args) {
        ShopKeeper saleobj = new ShopKeeper();
        saleobj.BlackberrySale();
        saleobj.SamsungSale();
    }
}
