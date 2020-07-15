package br.com.runner.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.runner.R
import br.com.runner.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}