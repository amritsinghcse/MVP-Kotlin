package com.example.android.mvpproject


class MyUser {
  private var name: String? = null
  private var email: String? = null

  fun setEmail(email: String) {
    this.email = email
  }

  fun setName(name: String) {
    this.name = name
  }

  override fun toString(): String = name + "\n" + email
}