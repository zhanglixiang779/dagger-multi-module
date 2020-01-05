package com.marcosholgado.feature2

import com.marcosholgado.core.di.FeatureScope
import com.marcosholgado.daggerplayground.di.CoreComponent
import dagger.Component

@Component(modules = [Feature2Module::class], dependencies = [CoreComponent::class])
@FeatureScope
interface Feature2Component {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): Feature2Component
    }

    fun inject(mainActivity: MainActivity)
}