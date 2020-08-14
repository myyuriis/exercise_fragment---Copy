package com.example.exercise_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.exercise_fragment.view_model.CounterViewModel
import kotlinx.android.synthetic.main.fragment_counter.*

class CounterFragment : Fragment(), View.OnClickListener {
    val counterViewModel by activityViewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        increaseButton.setOnClickListener(this)
        decreaseButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            increaseButton -> {
                counterViewModel.increase()
            }
            decreaseButton -> {
                counterViewModel.decrease()
            }
        }
    }
}