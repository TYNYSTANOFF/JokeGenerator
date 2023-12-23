package com.example.jokegenerator.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class JokeModel(

    var _id : String,

    var type : String,

    var setup: String,

    var punchline : String
) :Serializable
