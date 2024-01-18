package lt.techin.pd9_2.product_groups;

public class Alcohol extends AbstractProduct {
    private static final double VAT = 1.21;

    public Alcohol(String name, double price, double discount) {
        super(name, price, discount);
    }

    @Override
    public double getPriceWithVat() {

        return Math.round(this.getPrice() * VAT) * 100 / 100.00;
    }
}
