package com.marcosholgado.mymodule

import com.marcosholgado.core.di.FeatureScope
import com.marcosholgado.daggerplayground.di.CoreComponent
import dagger.Component

@Component(modules = [Feature1Module::class], dependencies = [CoreComponent::class])
@FeatureScope
interface Feature1Component {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): Feature1Component
    }

    fun inject(activity: OtherActivity)
}