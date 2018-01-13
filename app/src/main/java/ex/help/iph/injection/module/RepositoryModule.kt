package ex.help.iph.injection.module

import dagger.Module
import dagger.Provides
import ex.help.iph.core.repository.ExchangeRepository
import ex.help.iph.data.exchange.ExchangeRepositoryImpl
import ex.help.iph.injection.ApplicationScope
import javax.inject.Singleton

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@Module(includes = arrayOf(ApplicationModule::class))
class RepositoryModule {
    @Provides
    @ApplicationScope
    fun exchangeRepository(exchangeRepository: ExchangeRepositoryImpl): ExchangeRepository {
        return exchangeRepository
    }
}