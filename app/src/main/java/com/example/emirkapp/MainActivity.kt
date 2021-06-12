package com.example.emirkapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emirkapp.adapter.UserAdapter
import kotlinx.android.synthetic.main.activity_main.*

/*Hocam splash ve hakkında activitylerini istediğiniz gibi yaptım fakat main activityi dersi izlememe rağmen yapamadım
* en azından boş kalmaması için iki tane fragment koydum. Ödevi verdiğinizde uygulamayı kullanmayı bile bilmiyordum yine de
* başkalarından almak yerine kendim yapmaya çalıştım. Derste öğrettiğiniz her şey için teşekkür ederim.  */

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            val intent = Intent(this,HakkindaActivity::class.java)
            startActivity(intent)
        }

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

}