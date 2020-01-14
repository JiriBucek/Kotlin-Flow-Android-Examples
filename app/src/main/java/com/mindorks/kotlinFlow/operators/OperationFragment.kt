package com.mindorks.kotlinFlow.operators

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import com.mindorks.kotlinFlow.R
import kotlinx.android.synthetic.main.fragment_operation.*
import kotlinx.coroutines.CoroutineScope

abstract class OperationFragment(private val onClickLaunch: CoroutineScope.() -> Unit) :
    Fragment(R.layout.fragment_operation) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn.setOnClickListener {
            viewLifecycleOwner.lifecycle.coroutineScope.launchWhenCreated {
                onClickLaunch()
            }
        }
    }
}