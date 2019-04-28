package com.ehappy.guessnumber

import java.util.*

class SecretNumber {
    val secret: Int = Random().nextInt(10) + 1

    var count = 0
    fun validate(number: Int): Int {
        return number - secret
    }
}