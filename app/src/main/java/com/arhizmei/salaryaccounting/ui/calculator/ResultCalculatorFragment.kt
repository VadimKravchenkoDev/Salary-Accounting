package com.arhizmei.salaryaccounting.ui.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.arhizmei.salaryaccounting.R
import com.arhizmei.salaryaccounting.databinding.FragmentResultCalculatorBinding

class ResultCalculatorFragment : Fragment() {
    private var _binding: FragmentResultCalculatorBinding? = null
    private val binding get() = _binding
    private val viewModel: CalculatorViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_result_calculator,
            container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentResultCalculatorBinding.bind(view)
        viewModel.data.observe(viewLifecycleOwner) { calculatorData ->
            binding?.dayOfWeekEdit?.text = calculatorData.days.toString()
            binding?.hoursOfWeekEdit?.text = calculatorData.hours.toString()
            binding?.salaryAmountEdit?.text = calculatorData.salary.toString()
        }
    }
}