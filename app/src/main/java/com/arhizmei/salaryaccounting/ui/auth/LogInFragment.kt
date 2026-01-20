package com.arhizmei.salaryaccounting.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.arhizmei.salaryaccounting.R
import com.arhizmei.salaryaccounting.databinding.FragmentLogInBinding
import com.arhizmei.salaryaccounting.ui.viewModel.MainViewModel

class LogInFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private var _binding: FragmentLogInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstance: Bundle?) {
        super.onViewCreated(view, savedInstance)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.logInTextView.setOnClickListener {
            findNavController()
                .navigate(R.id.action_logIng_to_signUp)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
