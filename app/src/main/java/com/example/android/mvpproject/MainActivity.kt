package com.example.android.mvpproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(), MyView {


  private var userInfo: TextView? = null
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val myPresenter = MyPresenter(this)

    val name = findViewById<EditText>(R.id.name) as EditText
    val email = findViewById<EditText>(R.id.email) as EditText
    userInfo = findViewById<TextView>(R.id.user_info) as TextView
    val button = findViewById<Button>(R.id.submit) as Button
    button.setOnClickListener({
      myPresenter.updateFullName(name.text.toString())
      myPresenter.updateEmail(email.text.toString())
    })

  }

  override fun updateField(info: String) {
    userInfo!!.text = info
  }
}
