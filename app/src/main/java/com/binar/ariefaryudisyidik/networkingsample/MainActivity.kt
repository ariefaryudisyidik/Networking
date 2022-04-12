package com.binar.ariefaryudisyidik.networkingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.binar.ariefaryudisyidik.networkingsample.data.model.GetAllCarResponseItem
import com.binar.ariefaryudisyidik.networkingsample.data.network.CarsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CarsApi.retrofitService.allCar().enqueue(object : Callback<List<GetAllCarResponseItem>> {
            override fun onResponse(
                call: Call<List<GetAllCarResponseItem>>,
                response: Response<List<GetAllCarResponseItem>>
            ) {
            }

            override fun onFailure(call: Call<List<GetAllCarResponseItem>>, t: Throwable) {
            }
        })
    }
}