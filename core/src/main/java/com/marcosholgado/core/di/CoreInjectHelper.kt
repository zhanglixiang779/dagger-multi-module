package com.marcosholgado.core.di

import android.app.Application

fun provideCoreComponent(application: Application) =
    (application as? CoreComponentProvider)?.provideCoreComponent()
        ?: throw IllegalStateException("The application context you have passed does not implement CoreComponentProvider")
