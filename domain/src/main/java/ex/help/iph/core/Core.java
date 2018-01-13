package ex.help.iph.core;

import ex.help.iph.core.repository.ExchangeRepository;
import ex.help.iph.core.repository.RepositoryProvider;

public class Core {

    private final RepositoryProvider repositoryProvider;

    public Core(RepositoryProvider repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    public ExchangeRepository exchangeRate() {
        return repositoryProvider.exchangeRate();
    }
}
