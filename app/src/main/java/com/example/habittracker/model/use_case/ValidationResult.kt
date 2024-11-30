package com.example.habittracker.model.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
