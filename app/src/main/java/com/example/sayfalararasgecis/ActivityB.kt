package com.example.sayfalararasgecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sayfalararasgecis.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private lateinit var binding:ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoToC.setOnClickListener {
            val newIntent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(newIntent)
        }
    }
    // geri dönme
    override fun onBackPressed() {
        val newIntent = Intent(Intent.ACTION_MAIN)  //ana bir aksiyon gerçekleşicek?

        newIntent.addCategory(Intent.CATEGORY_HOME)     // ana sayfaya geri dönme kategorisi
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)   // yeni bir görev

        startActivity(newIntent)
    }
}