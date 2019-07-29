package com.upring.contacts.di.module

import android.app.Activity
import com.jmdelafuente.citiboxdemo.depinj.scopes.PerActivity
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    @PerActivity
    fun provideActivity(): Activity {
        return activity
    }



}