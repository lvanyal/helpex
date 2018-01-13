package ex.help.iph.core.interactor.exchange;

import ex.help.iph.core.executor.PostExecutionThread;
import ex.help.iph.core.executor.ThreadExecutor;
import ex.help.iph.core.interactor.UseCase;
import ex.help.iph.core.model.UserBalance;
import ex.help.iph.core.repository.ExchangeRepository;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by ivanphytsyk on 1/13/18.
 */

public class CalculateUsdAmount extends UseCase<Float, CalculateUsdAmount.Params> {

    private final ExchangeRepository exchangeRepository;

    public CalculateUsdAmount(ExchangeRepository exchangeRepository, ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.exchangeRepository = exchangeRepository;
    }

    @Override
    protected Observable<Float> buildUseCaseObservable(Params params) {
        return exchangeRepository.getUserBalance()
                .map(new Function<UserBalance, Float>() {
                    @Override
                    public Float apply(UserBalance userBalance) throws Exception {
                        return calculateUsdAmount();
                    }
                });
    }

    private Float calculateUsdAmount() {
        return null;
    }

    public static class Params {
        private String userId;
        private String exchangeCode;
        private String currencyPair;

        public Params(String userId, String exchangeCode, String currencyPair) {
            this.exchangeCode = exchangeCode;
            this.userId = userId;
            this.currencyPair = currencyPair;
        }
    }
}
