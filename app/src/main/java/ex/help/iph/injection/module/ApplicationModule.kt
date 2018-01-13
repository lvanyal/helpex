package ex.help.iph.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ex.help.iph.HelpExApplication
import ex.help.iph.concurrency.JobExecutor
import ex.help.iph.concurrency.UiThread
import ex.help.iph.core.executor.PostExecutionThread
import ex.help.iph.core.executor.ThreadExecutor
import ex.help.iph.core.repository.ExchangeRepository
import ex.help.iph.data.exchange.ExchangeRepositoryImpl
import ex.help.iph.injection.ApplicationScope
import javax.inject.Singleton

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@Module
class ApplicationModule(private val application: HelpExApplication) {

    @Provides
    @ApplicationScope
    fun context(): Context {
        return application;
    }

    @Provides
    @ApplicationScope
    fun threadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return JobExecutor()
    }

    @Provides
    @ApplicationScope
    fun postExecutionThread(uiThread: UiThread): PostExecutionThread {
        return uiThread
    }

}