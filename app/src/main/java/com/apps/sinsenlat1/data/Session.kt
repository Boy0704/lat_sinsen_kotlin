package com.apps.sinsenlat1.data

import android.content.Context
import android.content.SharedPreferences
import com.apps.sinsenlat1.data.constant.Constants


/**
 * Created by nuryazid on 4/21/18.
 */

class Session(context: Context) {

    var pref: SharedPreferences =
        context.getSharedPreferences(Constants.SHAREDPREF.NAME, Context.MODE_PRIVATE)

    val fcmId: String
        get() = pref.getString(
            Constants.SHAREDPREF.KEY_FCM_ID,
            Constants.SHAREDPREF.DEFAULT_VALUE_FCM_ID
        ) ?: ""

    val userId: String
        get() = pref.getString(
            Constants.SHAREDPREF.KEY_USER_ID,
            Constants.SHAREDPREF.DEFAULT_VALUE_USER_ID
        ) ?: ""


    val accessToken: String? get() = pref.getString(Constants.SHAREDPREF.KEY_TOKEN, null)
    val sessionId: String? get() = pref.getString(Constants.SHAREDPREF.KEY_SID, null)

    fun saveFcmId(value: String?) {
        val editor = pref.edit()
        editor?.putString(Constants.SHAREDPREF.KEY_FCM_ID, value)
        editor?.apply()
    }

    fun saveUserId(value: String?) {
        val editor = pref.edit()
        editor?.putString(Constants.SHAREDPREF.KEY_USER_ID, value)
        editor?.apply()
    }

    fun saveAccessToken(value: String?) {
        val editor = pref.edit()
        editor?.putString(Constants.SHAREDPREF.KEY_TOKEN, value)
        editor?.apply()
    }

    fun saveSid(value: String?) {
        val editor = pref.edit()
        editor?.putString(Constants.SHAREDPREF.KEY_SID, value)
        editor?.apply()
    }



    fun clearAll() {
        val bkFcmId = fcmId
        val bkUserId = userId
        val bkSessionId = sessionId
        val bkToken = sessionId

        val editor = pref.edit()
        editor.clear()

        editor?.putString(Constants.SHAREDPREF.KEY_FCM_ID, bkFcmId)
        editor?.putString(Constants.SHAREDPREF.KEY_USER_ID, bkUserId)
        editor?.putString(Constants.SHAREDPREF.KEY_SID, bkSessionId)
        editor?.putString(Constants.SHAREDPREF.KEY_TOKEN, bkToken)

        editor.apply()
    }
}