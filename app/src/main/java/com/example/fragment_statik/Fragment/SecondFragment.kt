package com.example.fragment_statik.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_statik.R

class SecondFragment:Fragment() {

    private lateinit var root: View
    private lateinit var btnSecond:Button
    private lateinit var tvSecond:TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_second,container,false)

        btnSecond = root.findViewById(R.id.btn_click2)
        tvSecond = root.findViewById(R.id.tv_second)

        btnSecond.setOnClickListener {
            Toast.makeText(context, "${tvSecond.text}", Toast.LENGTH_SHORT).show()
        }
        return root
    }
}