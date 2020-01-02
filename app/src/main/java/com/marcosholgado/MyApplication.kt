package com.marcosholgado

import android.app.Application
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import com.marcosholgado.core.di.CoreComponentProvider
import com.marcosholgado.core.navigation.CoreNavigation
import com.marcosholgado.daggerplayground.di.CoreComponent
import com.marcosholgado.daggerplayground.di.DaggerCoreComponent
import com.marcosholgado.mymodule.OtherActivity

class MyApplication : Application(), CoreComponentProvider, CoreNavigation {

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }

    override fun startOtherActivity() {
        val intent = Intent(this, OtherActivity::class.java)
        intent.addFlags(FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
}