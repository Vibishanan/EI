package Observer_Pattern;

public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " received notification: Stock price changed to " + price);
    }
}

