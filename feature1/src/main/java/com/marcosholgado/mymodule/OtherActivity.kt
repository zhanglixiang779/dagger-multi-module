package com.marcosholgado.mymodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcosholgado.core.ExpensiveObject
import com.marcosholgado.core.di.provideCoreComponent
import javax.inject.Inject

class OtherActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerFeature1Component
            .factory()
            .create(provideCoreComponent(application))
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
    }
}
