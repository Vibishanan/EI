package Observer_Pattern;
import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    protected List<Investor> investors = new ArrayList<>();

    public void registerInvestor(Investor investor) {
        investors.add(investor);
    }

    public void unregisterInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors(double price) {
        for (Investor investor : investors) {
            investor.update(price);
        }
    }

    public abstract void setPrice(double price);
}
