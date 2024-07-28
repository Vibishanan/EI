package Observer_Pattern;

public class ConcreteStock extends Stock {
    private double price;

    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyInvestors(price);
    }
}
