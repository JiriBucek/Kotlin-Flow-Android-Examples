package com.mindorks.kotlinFlow.model

import kotlinx.coroutines.flow.Flow

sealed class Operator {
    data class Merge(
        val flowOne: Flow<String>,
        val flowTwo: Flow<String>
    )
}