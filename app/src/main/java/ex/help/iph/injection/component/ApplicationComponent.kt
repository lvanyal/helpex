package ex.help.iph.injection.component

import android.content.Context
import dagger.Component
import ex.help.iph.core.Core
import ex.help.iph.core.executor.PostExecutionThread
import ex.help.iph.core.executor.ThreadExecutor
import ex.help.iph.core.repository.ExchangeRepository
import ex.help.iph.injection.ApplicationScope
import ex.help.iph.injection.module.ApplicationModule
import ex.help.iph.injection.module.RepositoryModule
import javax.inject.Singleton

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@ApplicationScope
@Component(modules = arrayOf(ApplicationModule::class, RepositoryModule::class))
interface ApplicationComponent {

    fun context(): Context
    fun threadExecutor(): ThreadExecutor
    fun postExecutionThread(): PostExecutionThread

    fun exchangeRepository(): ExchangeRepository
}