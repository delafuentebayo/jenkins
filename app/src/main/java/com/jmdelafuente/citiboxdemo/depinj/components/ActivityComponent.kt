package com.jmdelafuente.citiboxdemo.depinj.components

import com.jmdelafuente.citiboxdemo.activities.EpisodeDetailActivity.EpisodeDetailActivity
import com.jmdelafuente.citiboxdemo.activities.MainActivity.MainActivity
import com.jmdelafuente.citiboxdemo.depinj.modules.ActivityModule
import com.jmdelafuente.citiboxdemo.depinj.modules.PresenterModule
import com.jmdelafuente.citiboxdemo.depinj.scopes.PerActivity
import dagger.Component


@PerActivity
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class, PresenterModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(episodeDetailActivity: EpisodeDetailActivity)

}