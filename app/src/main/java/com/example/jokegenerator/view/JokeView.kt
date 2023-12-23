package com.example.jokegenerator.view

import com.example.jokegenerator.model.JokeModel

interface JokeView {
    fun setParameters(jokeModel: JokeModel)
}