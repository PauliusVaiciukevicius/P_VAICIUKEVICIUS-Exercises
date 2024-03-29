package lt.techin.pd9_2.product_groups;

import lt.techin.pd9_2.interfaces.DiscountItem;
import lt.techin.pd9_2.interfaces.ProductItem;

public abstract class AbstractProduct implements ProductItem, DiscountItem {
    private String name;
    private double price;
    private double discount; //percents

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AbstractProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        if (this.discount ==0) {
            return price;
        } else {
            return getPriceWithDiscount(this.discount);
        }

    }

    @Override
    public double getPriceWithDiscount(double discount) {
        return price - price * (discount/100);

    }
}

