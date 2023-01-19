package com.ardent.zeusardent.allfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ardent.zeusardent.hbgdfgfdgfg
import com.ardent.zeusardent.databinding.FragmentZeus3Binding

class zeus3 : Fragment() {
    private var binding : FragmentZeus3Binding? = null
    private val bindingF get() = binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZeus3Binding.inflate(inflater, container, false)
        return bindingF!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingF!!.backmenu.setOnClickListener {
            var view = menu()
            var viewPost = requireFragmentManager().beginTransaction()
            viewPost.replace(hbgdfgfdgfg.sadkncxidjas.id, view)
            viewPost.commit()
        }
    }
    companion object {

        fun newInstance() = zeus3()
    }
}