package com.apps.sinsenlat1.ui.print

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

class PrintViewModel @Inject constructor() : BaseViewModel()