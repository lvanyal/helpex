package ex.help.iph.presenter;

import javax.inject.Inject;

import ex.help.iph.core.interactor.exchange.CalculateUsdAmount;
import ex.help.iph.mapper.AccountInfoMapper;

/**
 * Created by ivanphytsyk on 1/13/18.
 */

class AccountInfoPresenter @Inject constructor(private val accountInfoMapper: AccountInfoMapper,
                                               private val calculateUsdAmount: CalculateUsdAmount) : Presenter {
    override fun subscribe() {

    }

    override fun unSubscribe() {
        calculateUsdAmount.dispose()
    }

}
