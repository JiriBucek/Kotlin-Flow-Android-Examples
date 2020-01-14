package com.mindorks.kotlinFlow

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mindorks.kotlinFlow.operators.*
import kotlinx.android.synthetic.main.fragment_operators.*

@Suppress("UNUSED_PARAMETER")
class OperatorsFragment : Fragment(R.layout.fragment_operators) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv.adapter = OperatorsAdapter(activityList) {
            startActivity(Intent(requireContext(), it))
        }
    }

    private val activityList = listOf(
        FilterFlowActivity::class.java,
        ZipFlowActivity::class.java,
        DistinctUntilChangedFlowActivity::class.java,
        OnCompletionFlowActivity::class.java,
        FlatMapConcatFlowActivity::class.java,
        FlatMapMergeFlowActivity::class.java,
        FlattenConcatFlowActivity::class.java,
        MergeFlowActivity::class.java,
        FlattenMergeFlowActivity::class.java,
        TransformLatestFlowActivity::class.java,
        FlatMapLatestFlowActivity::class.java,
        FilterFlowActivity::class.java,
        FilterNotFlowActivity::class.java,
        FilterIsInstanceFlowActivity::class.java,
        FilterNotNullFlowActivity::class.java,
        MapFlowActivity::class.java,
        ScanReduceFlowActivity::class.java,
        OnStartFlowActivity::class.java
    )
}