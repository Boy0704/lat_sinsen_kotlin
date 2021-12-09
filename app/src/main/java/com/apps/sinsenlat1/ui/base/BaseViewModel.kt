package com.apps.sinsenlat1.ui.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.apps.sinsenlat1.api.ApiResponse
import com.apps.sinsenlat1.api.ApiService
import com.apps.sinsenlat1.data.Session
import com.google.gson.Gson
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

open class BaseViewModel: ViewModel(), LifecycleObserver {

    @Inject
    lateinit var session: Session
    @Inject
    lateinit var gson: Gson
    @Inject
    open lateinit var apiService: ApiService

    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    val apiResponse = MutableLiveData<ApiResponse>()

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}