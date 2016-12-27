package com.example.android.resinfo_android

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ListView

class ListActivity extends AppCompatActivity {

  override protected def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)

    val toolbar = findViewById(R.id.toolbar).asInstanceOf[Toolbar]
    setSupportActionBar(toolbar)
    val fab = findViewById(R.id.fab).asInstanceOf[FloatingActionButton]
    fab.setOnClickListener(new View.OnClickListener() {
      def onClick(view: View) {
        startActivity(new Intent(getApplicationContext, classOf[FormActivity]))
      }
    })

    val listOfItems = List(new Item("David","Mischak","26-10-1994"))
    val listView = findViewById(R.id.myEntryList).asInstanceOf[ListView]
    listView.setAdapter(new CustomAdapter(getApplicationContext, listOfItems))

  }
}
