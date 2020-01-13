package com.mindorks.kotlinFlow

import android.content.Intent
import android.view.View
import androidx.fragment.app.Fragment
import com.mindorks.kotlinFlow.operators.*

@Suppress("UNUSED_PARAMETER")
class OperatorsFragment: Fragment(R.layout.fragment_operators) {

    fun startSimpleActivity(view: View?) =
        startActivity(Intent(requireContext(), SimpleFlowActivity::class.java))

    fun startZipActivity(view: View?) = startActivity(Intent(requireContext(), ZipFlowActivity::class.java))


    fun startDistinctUntilChangedActivity(view: View?) =
        startActivity(Intent(requireContext(), DistinctUntilChangedFlowActivity::class.java))


    fun startOnCompletionActivity(view: View?) =
        startActivity(Intent(requireContext(), OnCompletionFlowActivity::class.java))

    fun startFlatMapConcatActivity(view: View) =
        startActivity(Intent(requireContext(), FlatMapConcatFlowActivity::class.java))

    fun startFlatMapMergeActivity(view: View) =
        startActivity(Intent(requireContext(), FlatMapMergeFlowActivity::class.java))

    fun startFlattenConcatFlowActivity(view: View) =
        startActivity(Intent(requireContext(), FlattenConcatFlowActivity::class.java))

    fun startMergeFlowActivity(view: View) =
        startActivity(Intent(requireContext(), MergeFlowActivity::class.java))

    fun startFlatterMergeFlowActivity(view: View) =
        startActivity(Intent(requireContext(), FlattenMergeFlowActivity::class.java))

    fun startTransformLatestFlowActivity(view: View) =
        startActivity(Intent(requireContext(), TransformLatestFlowActivity::class.java))

    fun startFlatMapLatestFlowActivity(view: View) =
        startActivity(Intent(requireContext(), FlatMapLatestFlowActivity::class.java))

    fun startFilterActivity(view: View) =
        startActivity(Intent(requireContext(), FilterFlowActivity::class.java))

    fun startFilterNotActivity(view: View) =
        startActivity(Intent(requireContext(), FilterNotFlowActivity::class.java))

    fun startFilterIsInstanceFlowActivity(view: View) =
        startActivity(Intent(requireContext(), FilterIsInstanceFlowActivity::class.java))

    fun startFilterNotNullFlowActivity(view: View) =
        startActivity(Intent(requireContext(), FilterNotNullFlowActivity::class.java))

    fun startMapActivity(view: View) =
        startActivity(Intent(requireContext(), MapFlowActivity::class.java))


    fun startScanReduceActivity(view: View) =
        startActivity(Intent(requireContext(), ScanReduceFlowActivity::class.java))

    fun startOnStartActivity(view: View) =
        startActivity(Intent(requireContext(), OnStartFlowActivity::class.java))


}