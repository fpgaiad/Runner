package br.com.runner.ui.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import br.com.runner.repository.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {
}