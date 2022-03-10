package com.example.testlistview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/apk/getBoardList")
    Call<Board> getBoardList();

}
