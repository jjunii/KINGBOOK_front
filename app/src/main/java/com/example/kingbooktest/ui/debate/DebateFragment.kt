package com.example.kingbooktest.ui.debate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kingbooktest.R

class DebateFragment : Fragment() {

    private lateinit var debateViewModel: DebateViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        debateViewModel =
                ViewModelProvider(this).get(DebateViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_debate, container, false)
        val textView: TextView = root.findViewById(R.id.text_debate)
        debateViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}