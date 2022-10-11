package com.example.night_cart.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class CartWorker(appContext: Context, params: WorkerParameters ):
    Worker(appContext,params){
    override fun doWork(): Result {
        return Result.success()
    }

}