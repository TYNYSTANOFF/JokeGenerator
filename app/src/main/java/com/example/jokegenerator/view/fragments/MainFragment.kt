package com.example.jokegenerator.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jokegenerator.databinding.FragmentMainBinding
import com.example.jokegenerator.model.JokeModel
import com.example.jokegenerator.presenter.JokePresenter
import com.example.jokegenerator.view.JokeView

class MainFragment : Fragment(), JokeView {

    private lateinit var binding: FragmentMainBinding
    val presenter = JokePresenter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }


    private fun initClickers() {
        with(binding) {
            btnGenerate.setOnClickListener {
                presenter.getData()
            }
        }
    }

    override fun setParameters(jokeModel: JokeModel) {
        with(binding) {
            tvId.text = jokeModel._id
            tvSetup.text = jokeModel.setup
            tvPunchline.text = jokeModel.punchline
        }
    }


}