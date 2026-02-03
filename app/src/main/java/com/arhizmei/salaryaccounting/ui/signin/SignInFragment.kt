package com.arhizmei.salaryaccounting.ui.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.arhizmei.salaryaccounting.R
import com.arhizmei.salaryaccounting.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private val viewModel: SignInViewModel by viewModels()
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstance: Bundle?) {
        super.onViewCreated(view, savedInstance)
        binding.sigInTextView.setOnClickListener {
            findNavController()
                .navigate(R.id.action_sigIn_to_signUp)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
