package com.example.emirkapp

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import java.sql.Connection





    class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        checkconnection()
    }

        private fun checkconnection() {

            val manager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = manager.activeNetworkInfo

            if(null != networkInfo)
            {
                loadSplashScreen()
               /* if (networkInfo.type == ConnectivityManager.TYPE_WIFI){
                    Toast.makeText(this, "Wifi Connected", Toast.LENGTH_SHORT).show()
                }
                else if (networkInfo.type == ConnectivityManager.TYPE_MOBILE)
                {
                    Toast.makeText(this, "Wifi Connected", Toast.LENGTH_SHORT).show()
                } */
            }
            else
            {

                Toast.makeText(this, "İnternet Bağlantınızı Kontrol Ediniz!", Toast.LENGTH_SHORT).show()
                finish()

            }
        }

        private fun loadSplashScreen() {
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}