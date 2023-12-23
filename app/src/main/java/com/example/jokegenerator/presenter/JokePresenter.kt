package com.example.jokegenerator.presenter

import android.util.Log
import com.example.jokegenerator.model.JokeModel
import com.example.jokegenerator.model.RetrofitService
import retrofit2.Call
import retrofit2.Response

class JokePresenter {
    val api = RetrofitService().api
    val TAG = "ololo"


    fun getData() {
        api.getRandomJoke().enqueue(object : retrofit2.Callback<JokeModel> {
            override fun onResponse(call: Call<JokeModel>, response: Response<JokeModel>) {
                if (response.isSuccessful) {
                    val model = response.body()
                    model?.let {



                    }
                    Log.e(TAG, "onResponse: ${response.body()}")
                }
            }

            override fun onFailure(call: Call<JokeModel>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }

        })


    }
}