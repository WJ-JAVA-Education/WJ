package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {


    @SerializedName("pid")
    List<Long> pid;

    @SerializedName("title")
    List<String> title;

    @SerializedName("content")
    List<String> content;
}
