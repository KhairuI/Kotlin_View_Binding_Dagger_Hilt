package com.example.dagger_hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt.R
import com.example.dagger_hilt.databinding.ActivityMainBinding
import com.example.dagger_hilt.databinding.ActivitySecondBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    @Named("String1")
    lateinit var myString:String

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("Second Activity")

        binding.text2.text= myString
    }
}