package ex.help.iph.core.model;

/**
 * Created by ivanphytsyk on 1/12/18.
 */

public class ExchangeRate {
    private String pair;

    public ExchangeRate(String pair) {
        this.pair = pair;
    }

    public String getPair() {
        return pair;
    }
}
