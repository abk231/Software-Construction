package FacadePattern;


public class ShopKeeper {
    MobileShop samsung;
    MobileShop blackberry;
    
    ShopKeeper(){
        blackberry = new Blackberry();
        samsung = new Samsung();
        
    }
    
    public void BlackberrySale(){
        blackberry.ModelNo();
        blackberry.Price();
    }
    
    public void SamsungSale(){
        samsung.ModelNo();
        samsung.Price();
    }

}
