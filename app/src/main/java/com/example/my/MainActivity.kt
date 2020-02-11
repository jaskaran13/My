package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val names: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        names.add("jas")
        names.add("karan")
        names.add("jass")
        names.add("jaskaran")
        names.add("jassu")
        names.add("jasss")
        names.add("jas")
        names.add("karan")
        names.add("jass")
        names.add("jaskaran")
        names.add("jassu")
        names.add("jasss")
        names.add("jas")
        names.add("karan")
        names.add("jass")
        names.add("jaskaran")
        names.add("jassu")
        names.add("jasss")
        names.add("jas")
        names.add("karan")
        names.add("jass")
        names.add("jaskaran")
        names.add("jassu")
        names.add("jasss")

        nicknamelist.layoutManager=LinearLayoutManager(this)
        nicknamelist.adapter=nameAdapters(names,this)

    }
}
