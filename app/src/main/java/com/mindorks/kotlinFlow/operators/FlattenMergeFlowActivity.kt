package com.mindorks.kotlinFlow.operators

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.kotlinFlow.R
import kotlinx.android.synthetic.main.activity_example.*
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class FlattenMergeFlowActivity : AppCompatActivity() {

    lateinit var flowOne: Flow<String>
    lateinit var flowTwo: Flow<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)
        setupFlow()
        setupClick()
    }

    private fun setupClick() {
        btn.setOnClickListener {
            doSomeWork()
        }
    }

    private fun doSomeWork() {
        lifecycleScope.launchWhenCreated {
            val output = flowOf(flowOne, flowTwo)
                .flattenMerge()
                .toList()
            textView.text = output.toString()

        }
    }

    private fun setupFlow() {
        flowOne = flowOf("Himanshu", "Amit", "Janishar").flowOn(Dispatchers.Default)
        flowTwo = flowOf("Singh", "Shekhar", "Ali").flowOn(Dispatchers.Default)

    }
}