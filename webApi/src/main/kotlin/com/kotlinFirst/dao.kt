package com.kotlinFirst.dao

import java.util.*

data class User( val id: Int,
                 val NickName: String?)

data class Twitt(val id: Int,
                 val createDate: Date,
                 val text: String?)

data class following(val originId: Int, val followee: List<Int>?)

