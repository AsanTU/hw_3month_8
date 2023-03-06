package com.example.hw_3month_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        val etFirst: EditText = view.findViewById(R.id.et_first)
        val btn: Button = view.findViewById(R.id.btn_first)

        btn.setOnClickListener {
            val text = etFirst.text.toString()
            val hi = "Hi,$text"
            bundle.putString("MyArgs", hi)
            findNavController().navigate(R.id.secondFragment, bundle)
        }
    }
}