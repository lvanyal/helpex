package ex.help.iph.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import ex.help.iph.injection.ActivityScope

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @ActivityScope
    fun activity(): Activity {
        return activity
    }
}