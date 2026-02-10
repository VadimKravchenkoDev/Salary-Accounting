package com.arhizmei.salaryaccounting.ui.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.arhizmei.salaryaccounting.R
import com.arhizmei.salaryaccounting.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {
    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = _binding!!
    private val viewModel : CalculatorViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_calculator,
            container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentCalculatorBinding.bind(view)

        binding.calculateBt.setOnClickListener {
            val salary = binding.salaryAmountEdit.text.toString().toIntOrNull() ?:0
            val hours = binding.hoursOfWeekEdit.text.toString().toIntOrNull() ?:0
            val days = binding.dayOfWeekEdit.text.toString().toIntOrNull() ?:0

            viewModel.setData(salary, hours, days)

            findNavController().navigate(R.id.action_ca)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}