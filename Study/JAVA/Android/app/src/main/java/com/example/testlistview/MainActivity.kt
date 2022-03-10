package com.example.testlistview

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        var boardList = ArrayList<Board>();


        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create()).build();

        val service = retrofit.create(ApiService::class.java);

        service.boardList.enqueue(object : Callback<Board> {
            override fun onResponse(call: Call<Board>, response: Response<Board>) {
                if (response.isSuccessful) {
                    var board = response.body();
                }
            }

            override fun onFailure(call: Call<Board>, t: Throwable) {

            }
        })


    }
}