package com.marcosholgado.feature2

import dagger.Module
import dagger.Provides

@Module
class Feature2Module {
    @Provides
    fun provideInt() = 1
}