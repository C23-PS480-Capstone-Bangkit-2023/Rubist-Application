package com.C23PS480.Rubist.Model

data class UserModel(
    val uid: String,
    val name: String,
    val email: String,
    val photoUrl: String? = null,
    val phoneNumber: String? = null,
    val isLogin: Boolean,
    val token: String = ""
)
