package com.example.android.resinfo_android

import android.app.{Activity}
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.{ImageView, Toast}

class MainActivity extends Activity {
  override protected def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val nextButton: ImageView = findViewById(R.id.imageView4).asInstanceOf[ImageView]
    val infoButton: ImageView = findViewById(R.id.imageView5).asInstanceOf[ImageView]


    nextButton.setOnClickListener(new OnClickListener {
      def onClick(v: View): Unit = {
        startActivity(new Intent(getApplicationContext, classOf[ListActivity]))
      }
    })

    infoButton.setOnClickListener(new OnClickListener {
      def onClick(v: View): Unit = {
        startActivity(new Intent(getApplicationContext, classOf[Credits]))
      }
    })



  }
}
