package com.arhizmei.salaryaccounting.ui.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.arhizmei.salaryaccounting.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
    private val viewModel: SignUpViewModel by viewModels()
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstance: Bundle?) {
        super.onViewCreated(view, savedInstance)
        binding.enterTextView.setOnClickListener {
            findNavController()
                .navigate(com.arhizmei.salaryaccounting.R.id.action_sigUp_to_signIn)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}