package com.example.logInRabbit.domain

data class UserModelDomain (
    var id: String,
    var name: String = "",
    var lastName: String = "",
    var email: String = "",
    var password: String = "",
    var birthday: String = "",
    var description: String = "",
)
