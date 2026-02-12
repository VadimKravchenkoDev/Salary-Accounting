package com.arhizmei.salaryaccounting.ui.calculator

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.arhizmei.salaryaccounting.ui.data.CalculatorData

class CalculatorViewModel(
    private val state: SavedStateHandle
) : ViewModel() {
    companion object {
        private const val KEY_DATA = "calc_data"
    }
    fun saveData(salary: Int, hours: Int, days: Int) {
        state[KEY_DATA] = CalculatorData(salary, hours, days)
    }
}