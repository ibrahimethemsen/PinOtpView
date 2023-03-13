package com.ibrahimethemsen.pinotpview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ibrahimethemsen.pinotpview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pinOtpView.setOnInputDigitsListener(::pinOtpInputListener)     
    }

    private fun pinOtpInputListener(value : String){
        if (value == "1234"){
            Toast.makeText(this,"Giriş Yapıldı",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Hatalı PIN",Toast.LENGTH_SHORT).show()
        }
    }
}