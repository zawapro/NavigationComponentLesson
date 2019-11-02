package com.zawapro.navigationcomponentlesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false).also { layout ->
            layout.findViewById<Button>(R.id.button).setOnClickListener {
                // NavControllerを呼び出し、アクションを指定して遷移する
                findNavController().navigate(R.id.action_myFragment_to_myFragment22)
            }
        }
    }
}
