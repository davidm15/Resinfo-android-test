package com.example.android.resinfo_android

import android.content.Context
import android.view.{LayoutInflater, View, ViewGroup}
import android.widget.{BaseAdapter, TextView}

/**
  * Created by David on 27.12.2016.
  */
class CustomAdapter(val context: Context, val listItems: List[Item]) extends BaseAdapter{

  override def getCount: Int = {
  listItems.size
  }

  override def getItem(position: Int):Item = {
    listItems(position)
  }

  override def getItemId(position: Int):Long = {
    position
  }

  override def getView(position: Int, convertView: View, parent: ViewGroup):View = convertView match {
      case null => parent.getContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE).asInstanceOf[View]
      case _ =>
        convertView.findViewById(R.id.viewFirstname).asInstanceOf[TextView].setText(getItem(position).lastname)
        convertView.findViewById(R.id.viewLastname).asInstanceOf[TextView]setText(getItem(position).firstname)
        convertView.findViewById(R.id.viewBirthdate).asInstanceOf[TextView].setText(getItem(position).birthdate)
        convertView
  }
}

