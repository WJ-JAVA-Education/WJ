package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/apk/getAllBoardList")
    Call<Board> getAllBoardList();
    
}
