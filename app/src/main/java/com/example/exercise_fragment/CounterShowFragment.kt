package com.example.exercise_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.exercise_fragment.view_model.CounterViewModel
import kotlinx.android.synthetic.main.fragment_counter_show.*


class CounterShowFragment() : Fragment() {

    val counterViewModel: CounterViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(counterViewModel)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        counterViewModel.counter.observe(viewLifecycleOwner, Observer { setCounterToTextView(it) })
    }

    fun setCounterToTextView(counter: Int) {
        println("TERPANGGIL KARENA DATA BERUBAH $counter")
        counterTextView.text = counter.toString()
    }


}