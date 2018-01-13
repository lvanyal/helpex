package ex.help.iph.data.exchange;

import java.util.List;

import javax.inject.Inject;

import ex.help.iph.core.model.ExchangeRate;
import ex.help.iph.core.model.UserBalance;
import ex.help.iph.core.repository.ExchangeRepository;
import io.reactivex.Observable;

/**
 * Created by ivanphytsyk on 1/13/18.
 */

public class ExchangeRepositoryImpl implements ExchangeRepository {

    @Inject
    public ExchangeRepositoryImpl() {}

    @Override
    public Observable<List<ExchangeRate>> getExchangeRate() {
        return null;
    }

    @Override
    public Observable<UserBalance> getUserBalance() {
        return null;
    }
}
