package br.com.runner.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.runner.R
import br.com.runner.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}