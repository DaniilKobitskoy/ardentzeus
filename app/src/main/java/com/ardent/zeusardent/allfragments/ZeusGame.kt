package com.ardent.zeusardent.allfragments

import android.animation.LayoutTransition
import android.os.CountDownTimer
import android.view.View
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.ardent.zeusardent.R
import com.ardent.zeusardent.hbgdfgfdgfg
import com.ardent.zeusardent.databinding.FragmentZeusGameBinding
import com.ardent.zeusardent.mainadapter.adapterViewBinding
import com.ardent.zeusardent.webview
import java.util.*




var a: CountDownTimer? = null
var b: CountDownTimer? = null
var c: CountDownTimer? = null
var d: CountDownTimer? = null
var e: CountDownTimer? = null
var f: CountDownTimer? = null
var h: CountDownTimer? = null
var g: CountDownTimer? = null
lateinit var zeusman: ConstraintLayout
val zeusgoat: Random = Random()

class ZeusGame: adapterViewBinding<FragmentZeusGameBinding>(FragmentZeusGameBinding::inflate) {

    override fun webstring(){

        zeusman = gbuhnjkmdsa.okno
        if(dsfgrdfs.fgsgffdssdfsdf.value != null){
        }
        else{
            dsfgrdfs.fgsgffdssdfsdf.value = 0
        }
        gbuhnjkmdsa.zesxdcfvgbh.setOnClickListener {
            gbuhnjkmdsa.dfdsfsasas.visibility = View.GONE
            gbuhnjkmdsa.zesxdcfvgbh.visibility = View.GONE

            when(zeusgoat.nextInt(3)){
                0->positionView(gbuhnjkmdsa.sfdsfscdeasdsa)
                1->positionView(gbuhnjkmdsa.sfdsfscdeasdsa)
                2->positionView(gbuhnjkmdsa.dsfdsfsdfew)
            }
            pykishmykish()
        }
gbuhnjkmdsa.afdsfdsfewf.setOnClickListener {
    var view = menu()
    var viewPost = requireFragmentManager().beginTransaction()
    viewPost.replace(hbgdfgfdgfg.sadkncxidjas.id, view)
    viewPost.commit()
}
        gbuhnjkmdsa.oblako.setOnClickListener {
            PutinPidor(0)
        }
        gbuhnjkmdsa.oblako1.setOnClickListener {
            PutinPidor(1)
        }
        gbuhnjkmdsa.oblako.setOnClickListener {
            PutinPidor(2)
        }

    }

    private fun positionView(zeus: View){
        zeus.visibility = View.VISIBLE
        val Meeeeeeeesi = AnimationUtils.loadAnimation(requireContext(),
            R.anim.ghgfdgfdsg)
        zeus.startAnimation(Meeeeeeeesi)
        g = object : CountDownTimer(1000, 1000) {
            override fun onTick(secmib: Long) {}
            override fun onFinish() {
                zeus.visibility = View.GONE
                g?.cancel()
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        starttime()

    }

    override fun onStop() {
        super.onStop()
        starttime()
    }

    override fun onPause() {
        super.onPause()
        starttime()
    }
    private fun starttime(){
        a?.cancel()
        b?.cancel()
        c?.cancel()
        d?.cancel()
        e?.cancel()
        f?.cancel()
        h?.cancel()
        g?.cancel()
    }

    private fun posleftgo(posleftgo1: View){
        startanimto(lottieanimashions = posleftgo1)
    }

    private fun startanimto(lottieanimashions: View) {
        val objectanim = AnimationUtils.loadAnimation(requireContext(),
            R.anim.wrtgfdse)
        objectanim.fillAfter = true
        lottieanimashions.startAnimation(objectanim)
    }


    private fun leftpositions(a: View, b: Int, c: Int){
        posleftgo(a)
        com.ardent.zeusardent.allfragments.a = object : CountDownTimer(700, 700) {
            override fun onTick(logachev: Long) {}
            override fun onFinish() {
                com.ardent.zeusardent.allfragments.a?.cancel()
                zeusman.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
                val layoutConstrain = ConstraintSet()
                layoutConstrain.clone(zeusman)
                toGowatchers(layoutConstrain, b,c)
                TransitionManager.beginDelayedTransition(zeusman, AutoTransition().setStartDelay(5000))
                layoutConstrain.applyTo(zeusman)

            }
        }.start()
    }


    private fun toGowatchers(a1: ConstraintSet, b2: Int, c3: Int) {
        a1.clear(b2, ConstraintSet.LEFT)
        a1.clear(b2, ConstraintSet.TOP)
        a1.connect(b2, ConstraintSet.LEFT, b2, ConstraintSet.LEFT)
        a1.connect(b2, ConstraintSet.BOTTOM, c3, ConstraintSet.TOP, R.dimen.dp25
        )

    }

    private fun AlinaMalina(kyki: View){
        mommy(tobipizda = kyki)

    }

    private fun mommy(tobipizda: View) {
        val minimal = AnimationUtils.loadAnimation(requireContext(),
            R.anim.kldsfdshdfgb)
        minimal.fillAfter = true
        tobipizda.startAnimation(minimal)
    }

    private fun loyalitimolding(cacat: View, vbaert: Int, makintosh: Int){
        AlinaMalina(cacat)
        b = object : CountDownTimer(700, 700) {
            override fun onTick(kiki: Long) {}
            override fun onFinish() {
                b?.cancel()
                zeusman.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
                val lot = ConstraintSet()
                lot.clone(zeusman)
                toGowatchers(lot, vbaert,makintosh)
                TransitionManager.beginDelayedTransition(zeusman, AutoTransition().setStartDelay(5000))
                lot.applyTo(zeusman)
            }
        }.start()
    }

    private fun pykishmykish(){

        c = object : CountDownTimer(2000, 2000) {
            override fun onTick(litle: Long) {}
            override fun onFinish() {
                pokypkato()
                leftpositions(gbuhnjkmdsa.adsadafaf, R.id.adsadafaf, R.id.pisdjfdskfnn)
                c?.cancel()

            }
        }.start()
    }

    private fun pokypkato(){
        d = object : CountDownTimer(2000, 2000) {
            override fun onTick(maybe: Long) {}
            override fun onFinish() {
                startings()
                loyalitimolding(gbuhnjkmdsa.sfdsfdsfsfe, R.id.sfdsfdsfsfe, R.id.pisdjfdskfnn)

                d?.cancel()
            }
        }.start()
    }

    private fun startings(){
        frizing()
        e = object : CountDownTimer(2000, 2000) {
            override fun onTick(glass2: Long) {}
            override fun onFinish() {
                loyalitimolding(gbuhnjkmdsa.htgdrfsdsefrgrfvd, R.id.htgdrfsdsefrgrfvd, R.id.oblako)
                gbuhnjkmdsa.asdsadwadwad.visibility = View.VISIBLE
                e?.cancel()
            }
        }.start()

    }

    private fun frizing(){
        f = object : CountDownTimer(1000, 1000) {
            override fun onTick(popyliacia: Long) {}
            override fun onFinish() {
                leftpositions(gbuhnjkmdsa.asdsadwadwad, R.id.asdsadwadwad, R.id.oblachnie)
                gbuhnjkmdsa.oblachnie.visibility = View.VISIBLE
                noWarUK()
                f?.cancel()
            }
        }.start()
    }

    private fun noWarUK(){
        h = object : CountDownTimer(1200, 1200) {
            override fun onTick(noWarUK: Long) {}
            override fun onFinish() {
                RussianotUnderstand()
            }
        }.start()
    }

    private fun RussianotUnderstand() {
        gbuhnjkmdsa.oblako.visibility = View.VISIBLE
        gbuhnjkmdsa.dfdsfsasas.visibility = View.VISIBLE
        gbuhnjkmdsa.oblako1.visibility = View.VISIBLE
        gbuhnjkmdsa.pisdjfdskfnn.visibility = View.GONE
        h?.cancel()
    }

    private fun PutinPidor(sdfnf: Int){
        val hgfdsssasd = zeusgoat.nextInt(3)
        if(sdfnf==hgfdsssasd && hgfdsssasd==0){
            sadwqe3()
        }
        if(sdfnf==hgfdsssasd && hgfdsssasd==1){
            ddscesfdsadsad2()
        }
        if(sdfnf==hgfdsssasd && hgfdsssasd==2){
            psdfnbasd1()
        }
        if(sdfnf!=hgfdsssasd){
            when(hgfdsssasd){
                0-> {
                    sgfbvdcx1()
                }
                1-> {
                    hgbfsvdcx2()
                }
                2-> {
                    etgsvfddews()
                }
            }
            gbuhnjkmdsa.dfdsfsasas.text = resources.getString(R.string.ascxvvdsa)
            dsfgrdfs.fgsgffdssdfsdf.value = null
        }
        gbuhnjkmdsa.zesxdcfvgbh.setOnClickListener {
            (activity as webview).jnssdfasdljf()
        }
        gbuhnjkmdsa.zesxdcfvgbh.visibility = View.VISIBLE
    }
    private fun ddscesfdsadsad2() {
        gbuhnjkmdsa.dfdsfsasas.text = resources.getString(R.string.asdawdw)
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
    }
    private fun sadwqe3() {
        gbuhnjkmdsa.dfdsfsasas.text = resources.getString(R.string.asdawdw)
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeusno))

    }
    private fun psdfnbasd1() {
        gbuhnjkmdsa.dfdsfsasas.text = resources.getString(R.string.asdawdw)
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))

    }
    private fun etgsvfddews() {
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))
        gbuhnjkmdsa.dfdsfsasas.text = resources.getString(R.string.asdawdw)
    }



    private fun hgbfsvdcx2() {
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeusno))

    }

    private fun sgfbvdcx1() {
        gbuhnjkmdsa.oblako.setImageDrawable(resources.getDrawable(R.drawable.zeuswin))
        gbuhnjkmdsa.oblako1.setImageDrawable(resources.getDrawable(R.drawable.zeusno))
        gbuhnjkmdsa.oblachnie.setImageDrawable(resources.getDrawable(R.drawable.zeusno))

    }

}