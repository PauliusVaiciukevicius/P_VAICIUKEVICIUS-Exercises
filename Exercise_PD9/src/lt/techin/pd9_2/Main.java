package lt.techin.pd9_2;

import lt.techin.pd9_2.controllers.ShoppingCart;
import lt.techin.pd9_2.product_groups.Alcohol;
import lt.techin.pd9_2.product_groups.Food;
import lt.techin.pd9_2.product_groups.Medicine;

public class Main {
    public static void main(String[] args) {
Food bread = new Food("Vilniaus duona", 1, 50);
Medicine apap = new Medicine("apap", 3.50, 0 );
Alcohol vilniaus_alus = new Alcohol("Vilniaus_alus", 2.20, 0);

ShoppingCart myShoppingCart = new ShoppingCart();
myShoppingCart.addItem(bread);
//myShoppingCart.addItem(apap);
//myShoppingCart.addItem(vilniaus_alus);

        System.out.println(myShoppingCart.getTotalPrice() + "EUR");
        System.out.println(myShoppingCart.getTotalPriceWithVat()  + "EUR + VAT" );
        System.out.println(myShoppingCart.getPriceInUSD(1.0877) + "USD");
    }

}
