package com.ardent.zeusardent.mainadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class adapterViewBinding <T : ViewBinding>(private val bindingInflater: (LI: LayoutInflater) -> T) :
    Fragment() {
    private var sjhdfbsdjhfbawsd: T? = null
    protected lateinit var dsfgrdfs: kjhgfdscxvbgh
    protected val gbuhnjkmdsa get() = sjhdfbsdjhfbawsd!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sjhdfbsdjhfbawsd = bindingInflater.invoke(inflater)
        return gbuhnjkmdsa.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dsfgrdfs = ViewModelProvider(requireActivity())[kjhgfdscxvbgh::class.java]
        webstring()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        sjhdfbsdjhfbawsd = null

    }

    override fun onDestroy() {
        super.onDestroy()
        sjhdfbsdjhfbawsd = null

    }

    abstract fun webstring()

}