package br.com.runner.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.runner.R
import br.com.runner.ui.viewmodel.StatisticsViewModel

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}