package com.arhizmei.salaryaccounting.ui.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.arhizmei.salaryaccounting.R
import com.arhizmei.salaryaccounting.databinding.FragmentResultCalculatorBinding
import com.arhizmei.salaryaccounting.ui.data.CalculatorData

class ResultCalculatorFragment : Fragment() {
    private var _binding: FragmentResultCalculatorBinding? = null
    private val binding get() = _binding
    private val viewModel: ResultCalculatorViewModel by activityViewModels()

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
        val handle = findNavController().previousBackStackEntry?.savedStateHandle
        handle?.getLiveData<CalculatorData>("calc_data")
            ?.observe(viewLifecycleOwner) { data ->
                data?.let {
                    binding?.dayOfWeekEdit?.text = it.days.toString()
                    binding?.hoursOfWeekEdit?.text = it.hours.toString()
                    binding?.salaryAmountEdit?.text = it.salary.toString()
                }
            }
    }
}