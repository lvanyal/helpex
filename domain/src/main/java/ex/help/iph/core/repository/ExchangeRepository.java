package ex.help.iph.core.repository;

import java.util.List;

import ex.help.iph.core.model.ExchangeRate;
import ex.help.iph.core.model.UserBalance;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by ivanphytsyk on 1/11/18.
 */

public interface ExchangeRepository {
    Observable<List<ExchangeRate>> getExchangeRate();

    Observable<UserBalance> getUserBalance();
}
