package ex.help.iph.data;

import ex.help.iph.core.repository.ExchangeRepository;
import ex.help.iph.core.repository.RepositoryProvider;
import ex.help.iph.data.exchange.ExchangeRepositoryImpl;

/**
 * Created by ivanphytsyk on 1/13/18.
 */

public class HelpExRepositoryProvider implements RepositoryProvider {
    @Override
    public ExchangeRepository exchangeRate() {
        return new ExchangeRepositoryImpl();
    }
}
