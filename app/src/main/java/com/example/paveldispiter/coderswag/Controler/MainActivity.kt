package com.example.paveldispiter.coderswag.Controler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.paveldispiter.coderswag.Adapters.CategoryAdapter
import com.example.paveldispiter.coderswag.Model.Category
import com.example.paveldispiter.coderswag.R
import com.example.paveldispiter.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter :CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        adapter = ArrayAdapter(this,               //  adapter creates listview
//                android.R.layout.simple_list_item_1,       // in form of simple list item 1
//                DataService.categories)                    // from data in DataServices.categories

       adapter = CategoryAdapter(this, DataService.categories)


        categoryListView.adapter = adapter           //  setting ListViev to who it need to listen to

    }





}
