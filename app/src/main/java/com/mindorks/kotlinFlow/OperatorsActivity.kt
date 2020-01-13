package com.mindorks.kotlinFlow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OperatorsActivity : AppCompatActivity(R.layout.activity_operators) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.frameLayout,
                OperatorsFragment(),
                "OperatorsFragment"
            )
            .commit()
    }
}
