package br.com.runner.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.runner.R
import br.com.runner.service.TrackingService
import br.com.runner.ui.viewmodel.MainViewModel
import br.com.runner.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.google.android.gms.maps.GoogleMap
import kotlinx.android.synthetic.main.fragment_tracking.*

class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}