package com.grassdoor.mvvm.testing

import android.util.Log
import com.grassdoor.mvvm.models.Result

//
object Testing {
    fun test(results: List<Result>, tag: String) {
        for (result in results) Log.d(tag, tag + " : " + result.title)
    }
}