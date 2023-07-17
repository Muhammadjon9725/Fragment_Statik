package com.example.fragment_statik.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.fragment_statik.R
class FirstFragment : Fragment() {


    private lateinit var root:View
    private lateinit var tvInfo:TextView
    private lateinit var btnClick:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_first, container, false)

        btnClick = root.findViewById(R.id.btn_click)
        tvInfo = root.findViewById(R.id.tv_info)


        btnClick.setOnClickListener {
            Toast.makeText(context, "${tvInfo.text}", Toast.LENGTH_SHORT).show()
        }


        return root
    }
}