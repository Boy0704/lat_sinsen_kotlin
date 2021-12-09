package com.apps.sinsenlat1.ui.login

import android.os.CountDownTimer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import com.apps.sinsenlat1.api.ApiResponse
import com.apps.sinsenlat1.data.constant.Constants
import com.apps.sinsenlat1.ui.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject
import javax.inject.Inject

class LoginViewModel @Inject constructor() : BaseViewModel() {
    val userNotifier = MutableLiveData<String>()

    fun login(email: String, password: String) {
        compositeDisposable.add(
            apiService.login(email, password)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    val responseJson = JSONObject(it)
                    val apiStatus = responseJson.getInt(Constants.REMOTE.API_STATUS)
                    val apiMessage = responseJson.getJSONArray(Constants.REMOTE.API_MESSAGE)

                    if (apiStatus == Constants.REMOTE.API_STATUS_SUCCESS) {
                        val jsonObjectData = responseJson.getJSONObject(Constants.REMOTE.OBJ_DATA)
                        val name = jsonObjectData.getString("name")
                        userNotifier.postValue(name)
                    } else {
                        apiResponse.value = ApiResponse().responseWrong(apiMessage)
                    }
                }, {
                    apiResponse.value = ApiResponse().responseError(it)
                })
        )
    }
}