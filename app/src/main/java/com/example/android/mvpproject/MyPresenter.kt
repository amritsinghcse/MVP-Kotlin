package com.example.android.mvpproject

class MyPresenter(private var myView: MyView) {

  private var mMyUser: MyUser = MyUser()

  fun updateFullName(name: String) {
    mMyUser.setName(name)
    myView.updateField(mMyUser.toString())
  }


  fun updateEmail(email: String) {
    mMyUser.setEmail(email)
    myView.updateField(mMyUser.toString())
  }
}