package com.example.testlistview

import kotlin.properties.Delegates


public class Board {
    lateinit var pid : String
    lateinit var title : String
    lateinit var content : String

    constructor()

    constructor(pid: String, title: String, content: String) {
        this.pid = pid
        this.title = title
        this.content = content
    }



}