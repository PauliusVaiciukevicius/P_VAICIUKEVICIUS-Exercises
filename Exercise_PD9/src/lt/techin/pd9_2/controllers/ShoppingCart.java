package lt.techin.pd9_2.controllers;

import lt.techin.pd9_2.product_groups.AbstractProduct;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<AbstractProduct> items = new ArrayList<>();

    public void addItem(AbstractProduct item){
        items.add(item);

    }
    public double getTotalPrice(){
        double totalPrice = 0;
        for (AbstractProduct element : items){
            totalPrice +=element.getPrice();

        }
        return Math.round(totalPrice * 100) / 100.0;
    }
    public double getTotalPriceWithVat() {
        double totalPriceWithVat = 0;
        for (AbstractProduct element : items) {
            totalPriceWithVat += element.getPriceWithVat();

        }
        return Math.round(totalPriceWithVat * 100) / 100.0 ;
    }
    public double getPriceInUSD(double currencyExchange) {
        return Math.round(getTotalPrice() * currencyExchange * 100) / 100.0;

    }
}
