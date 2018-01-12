package com.example.android.mvpproject

class MyPresenter(private var myView: MyView) {

  private var mMyUser: MyUser = MyUser("", "")

  fun updateFullName(name: String) {
    mMyUser.name = name
    myView.updateField(mMyUser.toString())
  }


  fun updateEmail(email: String) {
    mMyUser.email = email
    myView.updateField(mMyUser.toString())
  }
}