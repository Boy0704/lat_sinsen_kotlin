package com.apps.sinsenlat1.ui.form.list

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.apps.sinsenlat1.data.room.visit.Visit
import com.apps.sinsenlat1.data.room.visit.VisitDao
import com.apps.sinsenlat1.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class VisitListViewModel @Inject constructor(val visitDao: VisitDao) : BaseViewModel() {
    fun getData(done: (visit: List<Visit>) -> Unit) = viewModelScope.launch {
        val datas = visitDao.getAll()
        done(datas)
    }
}