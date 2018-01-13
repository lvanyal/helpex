package ex.help.iph

import android.app.Application
import android.content.Context
import ex.help.iph.core.Core
import ex.help.iph.injection.component.ApplicationComponent
import ex.help.iph.injection.component.DaggerApplicationComponent
import ex.help.iph.injection.module.ApplicationModule
import ex.help.iph.injection.module.RepositoryModule
import javax.inject.Inject

/**
 * Created by ivanphytsyk on 1/13/18.
 */
class HelpExApplication : Application() {

    private lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var core: Core;

    override fun onCreate() {
        super.onCreate()

        initInjector()
    }

    private fun initInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    public fun applicationComponent(): ApplicationComponent {
        return applicationComponent
    }

    public fun get(context: Context): HelpExApplication {
        return context.applicationContext as HelpExApplication
    }

}