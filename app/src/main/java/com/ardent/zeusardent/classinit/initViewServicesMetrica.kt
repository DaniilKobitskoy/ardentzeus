package com.ardent.zeusardent.classinit

import android.app.Application
import android.util.Log
import com.ardent.zeusardent.key.keyFLONE
import com.ardent.zeusardent.gjjhggkhjkihjkhk
import com.onesignal.OneSignal
import org.json.JSONObject

class initViewServicesMetrica : Application() {

    override fun onCreate() {
        super.onCreate()
        try {
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
            OneSignal.initWithContext(this)
            OneSignal.setAppId(keyFLONE.signals)
            OneSignal.setExternalUserId(gjjhggkhjkihjkhk!!, object :
                OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(jsonObject: JSONObject) {
                }
                override fun onFailure(externalIdError: OneSignal.ExternalIdError) {

                }
            })

        }catch (e: Exception){

        }
    }
}