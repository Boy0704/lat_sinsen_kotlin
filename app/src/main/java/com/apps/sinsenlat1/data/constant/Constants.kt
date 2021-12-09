package com.apps.sinsenlat1.data.constant

class Constants {

    /**
     * Constants for response in API Request
     */
    object REMOTE {
        const val API_STATUS = "status"
        const val API_MESSAGE = "message"
        const val API_STATUS_SUCCESS = 1
        const val LIMIT = 10
        const val OBJ_ITEM = "item"
        const val OBJ_DATA = "data"
        const val ARR_DATA = "data"
        const val ARR_LIST = "list"
        const val DATE = "yyyy-MM-dd"
    }

    object INTENT {
        const val KEY_LOCATION = "location"
        const val KEY_DATE = "date"
        const val KEY_TIME = "time"
        const val KEY_TYPE = "type"
        const val KEY_ACC = "acc"
        const val KEY_RATING = "rating"
        const val KEY_DATA = "data"
    }

    /**
     * Constants for shared preference
     */
    object SHAREDPREF {
        val DEFAULT_VALUE_FCM_ID = null
        const val DEFAULT_VALUE_USER_ID = ""
        const val NAME = "NAME"
        const val KEY_FCM_ID = "FCM_ID"
        const val KEY_USER_ID = "USER_ID"
        const val KEY_TOKEN = "TOKEN"
        const val KEY_SID = "SID"

    }

    object DEFAULT {
        const val BASIC_AUTH_USER = "crocodic"
        const val BASIC_AUTH_PASS = "123456"
        const val TAG = "tag"
        const val SMALLES_WIDTH_DEFAULT = 380
        const val SMALLES_WIDTH_PROBABILITY = 330
    }
}