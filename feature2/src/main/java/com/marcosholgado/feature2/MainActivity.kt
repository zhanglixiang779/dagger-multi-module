package com.marcosholgado.feature2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcosholgado.core.ExpensiveObject
import com.marcosholgado.core.di.provideCoreComponent
import com.marcosholgado.core.navigation.CoreNavigation
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerFeature2Component
            .factory()
            .create(provideCoreComponent(application))
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            (application as? CoreNavigation)?.startOtherActivity()
        }
    }
}
