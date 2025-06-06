package com.app.mammago

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class RegestrationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_regestration, container, false)
        childFragmentManager.beginTransaction()
            .replace(R.id.child_fragment_container, AccountFragment())
            .commit()
        return  view
    }
}