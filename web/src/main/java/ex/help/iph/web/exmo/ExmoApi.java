package ex.help.iph.web.exmo;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by ivanphytsyk on 1/11/18.
 */

public interface ExmoApi {
    Flowable<List<ExmoExchangeRate>> getExchangeRates();
}
