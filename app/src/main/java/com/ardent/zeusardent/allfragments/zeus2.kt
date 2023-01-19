package com.ardent.zeusardent.allfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.ardent.zeusardent.R
import com.ardent.zeusardent.hbgdfgfdgfg
import com.ardent.zeusardent.databinding.FragmentZeus2Binding


class zeus2 : Fragment() {
    private var binding : FragmentZeus2Binding? = null
    private val bindingF get() = binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentZeus2Binding.inflate(inflater, container, false)
        return bindingF!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingF!!.zeus.setOnClickListener {
            val zeus = AnimationUtils.loadAnimation(requireContext(), R.anim.ghgfdgfdsg)
            bindingF!!.zeus.startAnimation(zeus)
            zeus.setAnimationListener(object : Animation.AnimationListener{
                override fun onAnimationStart(vectorsStart: Animation?) {
                }
                override fun onAnimationEnd(vectorsStart1: Animation?) {

                }
                override fun onAnimationRepeat(vectorsStart2: Animation?) {
                }
            })

        }
        bindingF!!.back1.setOnClickListener {
            var view = menu()
            var viewPost = requireFragmentManager().beginTransaction()
            viewPost.replace(hbgdfgfdgfg.sadkncxidjas.id, view)
            viewPost.commit()
        }
    }

    companion object {

        fun newInstance() = zeus2()
    }
}