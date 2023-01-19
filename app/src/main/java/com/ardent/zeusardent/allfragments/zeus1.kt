package com.ardent.zeusardent.allfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ardent.zeusardent.hbgdfgfdgfg
import com.ardent.zeusardent.databinding.FragmentZeus1Binding


class zeus1 : Fragment() {
    private var binding : FragmentZeus1Binding? = null
    private val bindingF get() = binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZeus1Binding.inflate(inflater, container, false)
        return bindingF!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingF!!.imageButton2.setOnClickListener {
            Toast.makeText(requireContext(), "WIN", Toast.LENGTH_SHORT).show()
            var view = menu()
            var viewPost = requireFragmentManager().beginTransaction()
viewPost.replace(hbgdfgfdgfg.sadkncxidjas.id, view)
            viewPost.commit()
        }
        bindingF!!.back.setOnClickListener {
            var view = menu()
            var viewPost = requireFragmentManager().beginTransaction()
            viewPost.replace(hbgdfgfdgfg.sadkncxidjas.id, view)
            viewPost.commit()
        }
    }
    companion object {

        fun newInstance() =
            zeus1()
    }
}