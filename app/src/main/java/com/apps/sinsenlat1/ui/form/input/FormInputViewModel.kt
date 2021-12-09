package com.apps.sinsenlat1.ui.form.input

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.apps.sinsenlat1.data.room.visit.Visit
import com.apps.sinsenlat1.data.room.visit.VisitDao
import com.apps.sinsenlat1.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class FormInputViewModel @Inject constructor(val visitDao: VisitDao) : BaseViewModel() {

    fun saveVisit(
        valueLocation: String,
        valueDate: String,
        valueTime: String,
        valueAccessories: List<String>,
        valueType: String,
        valueRating: Float
    ) = viewModelScope.launch {
        val visit = Visit(
            valueLocation,
            valueDate,
            valueTime,
            valueAccessories,
            valueType,
            valueRating
        )

        visitDao.insert(visit)
    }

    fun getData() = viewModelScope.launch {
        val datas = visitDao.getAll()
        Log.d("data", "jumlah data = ${datas.size}")
    }

}