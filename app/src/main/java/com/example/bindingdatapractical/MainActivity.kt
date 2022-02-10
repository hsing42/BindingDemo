package com.example.bindingdatapractical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bindingdatapractical.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("W123", "Ali")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myData = student
        // binding.tvID.text = student.id
        //binding.tvName.text = student.name

        binding.button.setOnClickListener(){

            student.name = "Alex"

            binding.apply{
                invalidateAll()
            }

        }

    }
}