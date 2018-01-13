package ex.help.iph.core.interactor.exchange;

import java.util.List;

import ex.help.iph.core.executor.PostExecutionThread;
import ex.help.iph.core.executor.ThreadExecutor;
import ex.help.iph.core.interactor.UseCase;
import ex.help.iph.core.model.ExchangeRate;
import ex.help.iph.core.repository.ExchangeRepository;
import io.reactivex.Observable;

/**
 * Created by ivanphytsyk on 1/12/18.
 */

public class GetExchangeRates extends UseCase<List<ExchangeRate>, GetExchangeRates.Params> {

    private final ExchangeRepository exchangeRepository;

    public GetExchangeRates(ExchangeRepository exchangeRepository, ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.exchangeRepository = exchangeRepository;
    }

    @Override
    protected Observable<List<ExchangeRate>> buildUseCaseObservable(Params params) {
        return exchangeRepository.getExchangeRate();
    }

    public static class Params {
        private String exchangeCode;
        private String currencyPair;

        public Params(String exchangeCode, String currencyPair) {
            this.exchangeCode = exchangeCode;
            this.currencyPair = currencyPair;
        }
    }
}
