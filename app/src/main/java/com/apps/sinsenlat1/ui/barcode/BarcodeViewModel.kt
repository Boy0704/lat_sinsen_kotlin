package com.apps.sinsenlat1.ui.barcode

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.apps.sinsenlat1.data.room.visit.Visit
import com.apps.sinsenlat1.data.room.visit.VisitDao
import com.apps.sinsenlat1.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class BarcodeViewModel @Inject constructor(val visitDao: VisitDao) : BaseViewModel()