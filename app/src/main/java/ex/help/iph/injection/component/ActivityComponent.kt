package ex.help.iph.injection.component

import dagger.Component
import ex.help.iph.injection.ActivityScope
import ex.help.iph.injection.module.ActivityModule

/**
 * Created by ivanphytsyk on 1/13/18.
 */
@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(ApplicationComponent::class))
@ActivityScope
interface ActivityComponent {
}